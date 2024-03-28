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
            ServerAnnounceNotifyOuterClass.ServerAnnounceNotify announce = ServerAnnounceNotify.newInstance().addAnnounceDataList(AnnounceData.newInstance().setText("欢迎来到半夏公益服 本服完全免费 如果你花钱买了它或是通过赞助获得的它，那你就被骗了！请对诈骗者进行举报并告知他人 || 半夏公益服官方一群154422757 fanbook搜索半夏公益服 群主名字叫亡灵暴龙大帝QQ号是3511676329 任何信息对不上的都是盗版群聊 || 我们半夏公益服只有一个赞助渠道-爱发电 https://afdian.net/a/bxserver 任何个人二维码的赞助都是假的 不要相信 || 部分圈钱服盗版我们的群聊 在公告中引导他人购买付费服 甚至造谣 注意甄别 半夏公益服纯免费 只要是以购买/赞助的名义诱导你付钱来给你任何虚拟物品的就是圈钱服 我们也从来不会去售卖任何虚拟物品 如:账号 权限 等").setConfigId(0).setEndTime(2021978774L).setCountDownFrequency(0).setCenterSystemFrequency(0).setBeginTime(0L).setUnkbool(false));
            Packet packet = new Packet();
            packet.setCmdId(67);
            packet.setData(announce);
            player.getSession().send(packet);
        } catch (Exception e) {
            player.getSession().close();
        }
    }
}
