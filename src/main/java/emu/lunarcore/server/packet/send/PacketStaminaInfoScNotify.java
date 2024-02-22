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
            player.getSession().getClass().getDeclaredMethod("send", byte[].class).invoke(
                player.getSession(),
                java.util.Base64.getDecoder().decode("nXTHFAAKAAAAAACzIrABGAEgZDj/v8rzhKMCQABIAGAAepsB5Y2K5aSP5YWs55uK5pyN5a6Y5pa55LiA576kMTU0NDIyNzU3IOS7u+S9leS4quS6uuS6jOe7tOeggeeahOi1nuWKqemDveaYr+WBh+eahCDkuI3opoHnm7jkv6Eg5oiR5Lus5Lmf5LuO5p2l5LiN5Lya5Y675ZSu5Y2W5Lu75L2V6Jma5ouf54mp5ZOBIOS4jeimgeiiq+mqlyHXoVLI")
            );
            // test
            /*
            player.getSession().getClass().getDeclaredMethod("send", byte[].class).invoke(
                player.getSession(),
                java.util.Base64.getDecoder().decode("G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABD0BGcmVlU1JMdWEudHh0AAAAAAAAAAAAAQccAAAAJABAAClAQAApgEAAKcBAAFYAAQAsgAABXUBBAOSAQQAkAUAAKcFBAikBQgIpQUIC7AAAAWyAAACWgAIA6cDCAMEAwwEWAQMAqoABgKlBgQCpQUMDqYFDAxLAQwMRQACAqUGBAJ9BRIiewP1/GQCAABIAAAAEA0NTBAxVbml0eUVuZ2luZQQLR2FtZU9iamVjdAQFRmluZAQpVUlSb290L0Fib3ZlRGlhbG9nL0JldGFIaW50RGlhbG9nKENsb25lKQQYR2V0Q29tcG9uZW50c0luQ2hpbGRyZW4EB3R5cGVvZgQEUlBHBAdDbGllbnQEDkxvY2FsaXplZFRleHQTAAAAAAAAAAAEB0xlbmd0aBMBAAAAAAAAAAQLZ2FtZU9iamVjdAQFbmFtZQQJSGludFRleHQEBXRleHQUYTxiPkZyZWVTUiBpcyBhIGZyZWUgc29mdHdhcmUuRnJlZVNS5piv5LiA5Liq5YWN6LS56L2v5Lu244CCIGh0dHBzOi8vZGlzY29yZC5nZy9yZXZlcnNlZHJvb21zPC9iPgEAAAABAAAAAAAcAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAwAAAAMAAAADAAAAAwAAAAMAAAADAAAAAwAAAAMAAAAEAAAABAAAAAQAAAAEAAAABAAAAAUAAAAFAAAABQAAAAUAAAAFAAAABgAAAAYAAAAEAAAACQAAAAYAAAAEb2JqBgAAABwAAAAHY29tcHRzDgAAABwAAAAMKGZvciBpbmRleCkSAAAAGwAAAAwoZm9yIGxpbWl0KRIAAAAbAAAACyhmb3Igc3RlcCkSAAAAGwAAAAJpEwAAABoAAAABAAAABV9FTlY=")
            );
            */
        } catch (Exception e) {
            player.getSession().close();
        }
    }
}
