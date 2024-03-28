package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.StaminaInfoScNotifyOuterClass.StaminaInfoScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

import emu.lunarcore.proto.AnnounceDataOuterClass.AnnounceData;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass;

public class PacketStaminaInfoScNotify extends BasePacket {

    public PacketStaminaInfoScNotify(Player player) {
        super(CmdId.StaminaInfoScNotify);
        
        var data = StaminaInfoScNotify.newInstance()
                .setNextRecoverTime(player.getNextStaminaRecover() / 1000)
                .setStamina(player.getStamina())
                .setReserveStamina((int) Math.floor(player.getStaminaReserve()));
        
        this.setData(data);
        
        try {
            ServerAnnounceNotifyOuterClass.ServerAnnounceNotify announce = ServerAnnounceNotify.newInstance().addAnnounceDataList(AnnounceData.newInstance().setText("123").setConfigId(0).setEndTime(2021978774L).setCountDownFrequency(0).setCenterSystemFrequency(0).setBeginTime(0L).setUnkbool(false));
            Packet packet = new Packet();
            packet.setCmdId(67);
            packet.setData(announce);
            player.getSession().send(packet);
        } catch (Exception e) {
            player.getSession().close();
        }
    }
}
