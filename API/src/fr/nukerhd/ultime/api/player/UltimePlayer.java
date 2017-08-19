package fr.nukerhd.ultime.api.player;

import fr.nukerhd.ultime.api.player.currency.UltimeCurrency;
import fr.nukerhd.ultime.api.player.rank.UltimeRank;
import fr.nukerhd.ultime.api.translate.Translator;
import fr.nukerhd.ultime.api.translate.language.Languages;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimePlayer
{
    
    private Player         player;
    private UltimeRank     rank;
    private UltimeCurrency ultimeCurrency;
    
    private Languages lang;
    
    public UltimePlayer(Player player)
    {
        this.player = player;
    }
    
    public void sendMessage(String message, boolean prefix)
    {
    
    }
    
    public Languages getLang()
    {
        return lang;
    }
    
    public void sendTitle(String title, String subTitle)
    {
        new TitleBuilder(title, subTitle).build();
    }
    
    public void sendActionBar(String text)
    {
        new ActionBarBuilder(text).build();
    }
    
    private class TitleBuilder
    {
        
        private String title, subTitle;
        private final int ticks = 1 * 20;
        
        public TitleBuilder(
                String title,
                String subTitle)
        {
            this.title = title;
            this.subTitle = subTitle;
        }
        
        public void build()
        {
            IChatBaseComponent titleComponent    = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + title + "\"}");
            IChatBaseComponent subTitleComponent = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + subTitle + "\"}");
            PacketPlayOutTitle titlePacket       = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TITLE, titleComponent);
            PacketPlayOutTitle subTitlePacket    = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.SUBTITLE, subTitleComponent);
            PacketPlayOutTitle timePacket        = new PacketPlayOutTitle(PacketPlayOutTitle.EnumTitleAction.TIMES, null, 20, ticks, 20);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(titlePacket);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(subTitlePacket);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(timePacket);
            
        }
        
    }
    
    private class ActionBarBuilder
    {
        private String text;
        
        public ActionBarBuilder(String text)
        {
            this.text = text;
        }
        
        public void build()
        {
            IChatBaseComponent actionBarComponent = IChatBaseComponent.ChatSerializer.a("{\"text\": \"" + text + "\"}");
            PacketPlayOutChat  actionBarPacket    = new PacketPlayOutChat(actionBarComponent, (byte) 2);
            ((CraftPlayer) player).getHandle().playerConnection.sendPacket(actionBarPacket);
        }
        
    }
    
}
