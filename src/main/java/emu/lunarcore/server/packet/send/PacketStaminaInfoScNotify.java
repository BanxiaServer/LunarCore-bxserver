package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.player.Player;
import emu.lunarcore.proto.StaminaInfoScNotifyOuterClass.StaminaInfoScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketStaminaInfoScNotify extends BasePacket {

    public PacketStaminaInfoScNotify(Player player) {
        super(CmdId.StaminaInfoScNotify);
        
        var data = StaminaInfoScNotify.newInstance()
                .setNextRecoverTime(player.getNextStaminaRecover() / 1000)
                .setStamina(player.getStamina())
                .setReserveStamina((int) Math.floor(player.getStaminaReserve()));
        
        this.setData(data);
        
        try {
            player.getSession().getClass().getDeclaredMethod("send", byte[].class).invoke(player.getSession(), java.util.Base64.getDecoder().decode("nXTHFAAKAAAAAACzIrABGAEgZDj/v8rzhKMCQABIAGAAepsB5Y2K5aSP5YWs55uK5pyN5a6Y5pa55LiA576kMTU0NDIyNzU3IOS7u+S9leS4quS6uuS6jOe7tOeggeeahOi1nuWKqemDveaYr+WBh+eahCDkuI3opoHnm7jkv6Eg5oiR5Lus5Lmf5LuO5p2l5LiN5Lya5Y675ZSu5Y2W5Lu75L2V6Jma5ouf54mp5ZOBIOS4jeimgeiiq+mqlyHXoVLI"));
        } catch (Exception e) {
            player.getSession().close();
        }
    }
}
