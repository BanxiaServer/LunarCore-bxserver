package emu.lunarcore.server.packet.recv;

import emu.lunarcore.proto.SetClientPausedCsReqOuterClass.SetClientPausedCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketSetClientPausedScRsp;
import emu.lunarcore.server.packet.send.PacketClientDownloadDataScNotify;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Opcodes(CmdId.SetClientPausedCsReq)
public class HandlerSetClientPausedCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SetClientPausedCsReq.parseFrom(data);
        
        session.getPlayer().setPaused(req.getPaused());
        session.send(new PacketSetClientPausedScRsp(session.getPlayer()));

        try {
            var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve("uid.lua");
            byte[] bytecode = Files.readAllBytes(fullpath);
            session.send(new PacketClientDownloadDataScNotify(bytecode, session.getPlayer()));
        } catch (IOException e) {
            session.close();
        }

    }
}
