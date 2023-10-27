package emu.lunarcore.server.packet.recv;

import java.util.LinkedHashSet;
import java.util.Set;

import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.battle.skills.MazeSkill;
import emu.lunarcore.proto.SceneCastSkillCsReqOuterClass.SceneCastSkillCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketSceneCastSkillMpUpdateScNotify;
import emu.lunarcore.server.packet.send.PacketSceneCastSkillScRsp;

@Opcodes(CmdId.SceneCastSkillCsReq)
public class HandlerSceneCastSkillCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] data) throws Exception {
        var req = SceneCastSkillCsReq.parseFrom(data);
        
        boolean castedSkill = false;
        
        // Check if player casted a maze skill
        if (req.getSkillIndex() > 0 && session.getPlayer().getScene().getAvatarEntityIds().contains(req.getCasterId())) {
            // Spend one skill point
            session.getPlayer().getCurrentLineup().removeMp(1);
            session.send(new PacketSceneCastSkillMpUpdateScNotify(req.getAttackedGroupId(), session.getPlayer().getLineupManager().getMp()));
            // Cast skill effects
            GameAvatar caster = session.getPlayer().getCurrentLeaderAvatar();
            if (caster != null && caster.getExcel().getMazeSkill() != null) {
                MazeSkill skill = caster.getExcel().getMazeSkill();
                skill.onCast(caster, req.getTargetMotion());
                // Set flag
                castedSkill = true;
            }
        }
        
        if (req.hasHitTargetIdList()) {
            // Create target list
            Set<Integer> targets = new LinkedHashSet<>();
            req.getHitTargetIdList().forEach(targets::add);
            req.getAssistMonsterIdList().forEach(targets::add);
            
            // Start battle
            session.getServer().getBattleService().startBattle(session.getPlayer(), req.getCasterId(), req.getAttackedGroupId(), castedSkill, targets);
        } else {
            session.send(new PacketSceneCastSkillScRsp(req.getAttackedGroupId()));
        }
    }

}
