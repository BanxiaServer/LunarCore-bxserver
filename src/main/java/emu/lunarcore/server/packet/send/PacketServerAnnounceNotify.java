/*
package emu.lunarcore.server.packet.send;

import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {
    
    public PacketServerAnnounceNotify() {
        super(CmdId.ServerAnnounceNotify);

        byte[] byteArray = {
            (byte)0x12, (byte)0xb0, (byte)0x01, (byte)0x08, (byte)0x00, (byte)0x20, (byte)0xff, (byte)0xbf, (byte)0xca, (byte)0xf3, 
            (byte)0x84, (byte)0xa3, (byte)0x02, (byte)0x30, (byte)0x00, (byte)0x38, (byte)0x64, (byte)0x48, (byte)0x01, (byte)0x58, 
            (byte)0x01, (byte)0x2a, (byte)0x9b, (byte)0x01, (byte)0x4c, (byte)0x55, (byte)0x4e, (byte)0x41, (byte)0x52, (byte)0x43, 
            (byte)0x4f, (byte)0x52, (byte)0x45, (byte)0x20, (byte)0x49, (byte)0x53, (byte)0x20, (byte)0x41, (byte)0x20, (byte)0x46, 
            (byte)0x52, (byte)0x45, (byte)0x45, (byte)0x20, (byte)0x53, (byte)0x4f, (byte)0x46, (byte)0x54, (byte)0x57, (byte)0x41, 
            (byte)0x52, (byte)0x45, (byte)0x2e, (byte)0x20, (byte)0x49, (byte)0x46, (byte)0x20, (byte)0x59, (byte)0x4f, (byte)0x55, 
            (byte)0x20, (byte)0x50, (byte)0x41, (byte)0x49, (byte)0x44, (byte)0x20, (byte)0x46, (byte)0x4f, (byte)0x52, (byte)0x20, 
            (byte)0x49, (byte)0x54, (byte)0x2c, (byte)0x20, (byte)0x59, (byte)0x4f, (byte)0x55, (byte)0x20, (byte)0x48, (byte)0x41, 
            (byte)0x56, (byte)0x45, (byte)0x20, (byte)0x42, (byte)0x45, (byte)0x45, (byte)0x4e, (byte)0x20, (byte)0x53, (byte)0x43, 
            (byte)0x41, (byte)0x4d, (byte)0x4d, (byte)0x45, (byte)0x44, (byte)0x21, (byte)0x20, (byte)0x6c, (byte)0x75, (byte)0x6e, 
            (byte)0x61, (byte)0x72, (byte)0x63, (byte)0x6f, (byte)0x72, (byte)0x65, (byte)0x20, (byte)0xe6, (byte)0x98, (byte)0xaf, 
            (byte)0xe4, (byte)0xb8, (byte)0x80, (byte)0xe6, (byte)0xac, (byte)0xbe, (byte)0xe5, (byte)0x85, (byte)0x8d, (byte)0xe8, 
            (byte)0xb4, (byte)0xb9, (byte)0xe8, (byte)0xbd, (byte)0xaf, (byte)0xe4, (byte)0xbb, (byte)0xb6, (byte)0xe3, (byte)0x80, 
            (byte)0x82, (byte)0xe5, (byte)0xa6, (byte)0x82, (byte)0xe6, (byte)0x9e, (byte)0x9c, (byte)0xe4, (byte)0xbd, (byte)0xa0, 
            (byte)0xe8, (byte)0x8a, (byte)0xb1, (byte)0xe9, (byte)0x92, (byte)0xb1, (byte)0xe4, (byte)0xb9, (byte)0xb0, (byte)0xe4, 
            (byte)0xba, (byte)0x86, (byte)0xe5, (byte)0xae, (byte)0x83, (byte)0xef, (byte)0xbc, (byte)0x8c, (byte)0xe9, (byte)0x82, 
            (byte)0xa3, (byte)0xe4, (byte)0xbd, (byte)0xa0, (byte)0xe5, (byte)0xb0, (byte)0xb1, (byte)0xe8, (byte)0xa2, (byte)0xab, 
            (byte)0xe9, (byte)0xaa, (byte)0x97, (byte)0xe4, (byte)0xba, (byte)0x86, (byte)0xef, (byte)0xbc, (byte)0x81
        };

        this.setData(byteArray);
    }
}
*/


package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify;
import emu.lunarcore.proto.ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.AnnounceData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketServerAnnounceNotify extends BasePacket {
    
    public PacketServerAnnounceNotify() {
        super(CmdId.ServerAnnounceNotify);

        AnnounceData announceData = AnnounceData.newInstance()
            .setBeginTime(0L)
            .setEndTime(9999999999999L)
            .setCountDownText("欢迎来到半夏公益服 本服完全免费 请不要倒卖 如果你花钱买了它或是通过赞助获得的它，那你就被骗了！请对诈骗者进行举报并告知他人 || 半夏公益服官方一群154422757 qq频道号是bxserver114514 群主名字叫亡灵暴龙大帝QQ号是3511676329 任何信息对不上的都是盗版群聊 || 我们半夏公益服只有一个赞助渠道-爱发电 https://afdian.net/a/bxserver 任何个人二维码的赞助都是假的 不要相信 || 部分圈钱服盗版我们的群聊 在公告中引导他人购买付费服 甚至造谣 注意甄别 半夏公益服纯免费 只要是以购买/赞助的名义诱导你付钱来给你任何虚拟物品的就是圈钱服 我们也从来不会去售卖任何虚拟物品 如:账号 权限 等 半夏公益服将一直致力于成为公益服的标杆")
            .setCenterSystemFrequency(100)
            .setCountDownFrequency(1)
            .setIsCenterSystemLast5EveryMinutes(true)
            .setConfigId(0);

        var data = ServerAnnounceNotify.newInstance()
            .addAnnounceDataList(announceData);

        this.setData(data);
    }
}


/* gc
package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.*;
import emu.grasscutter.net.proto.*;
import emu.grasscutter.utils.Utils;
import java.util.List;

public class PacketServerAnnounceNotify extends BasePacket {

    public PacketServerAnnounceNotify(List<AnnounceDataOuterClass.AnnounceData> data) {
        super(PacketOpcodes.ServerAnnounceNotify);

        var proto = ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newBuilder();

        proto.addAllAnnounceDataList(data);

        this.setData(proto);
    }

    public PacketServerAnnounceNotify(String msg, int configId) {
        super(PacketOpcodes.ServerAnnounceNotify);

        var proto = ServerAnnounceNotifyOuterClass.ServerAnnounceNotify.newBuilder();

        proto.addAnnounceDataList(
                AnnounceDataOuterClass.AnnounceData.newBuilder()
                        .setConfigId(configId)
                        .setBeginTime(Utils.getCurrentSeconds() + 1)
                        .setEndTime(Utils.getCurrentSeconds() + 2)
                        .setCenterSystemText(msg)
                        .setCenterSystemFrequency(1)
                        .build());

        this.setData(proto);
    }
}
*/