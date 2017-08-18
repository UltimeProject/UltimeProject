package fr.nukerhd.ultime.api.plugin;

import com.google.common.collect.Lists;
import fr.nukerhd.ultime.api.player.UltimePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public abstract class UltimePlugin
        extends JavaPlugin
{
    
    private List<UltimePlayer> players = Lists.newArrayList();
    
    public void onLoad()
    {
        super.onLoad();
    }
    
    public void onEnable()
    {
        super.onEnable();
    }
    
    public void onDisable()
    {
        super.onDisable();
    }
    
    public boolean containsPlayer(UltimePlayer player)
    {
        return players.contains(player);
    }
    
    /**
     * Cette méthode permet d'ajouter un joueur
     *
     * @param player
     */
    public void addPlayer(UltimePlayer player)
    {
        if (!containsPlayer(player))
            players.add(player);
    }
    
    /**
     * Cette méthode permet de supprimer un joueur
     *
     * @param player
     */
    public void removePlayer(UltimePlayer player)
    {
        if (containsPlayer(player))
            players.remove(player);
    }
    
    public UltimePlayer getPlayer(Player player)
    {
        for (UltimePlayer ultimePlayer : players)
        {
            if (ultimePlayer.getPlayer().getName().equals(player.getName()))
                return ultimePlayer;
        }
        return null;
    }
    
    public List<UltimePlayer> getPlayers()
    {
        return players;
    }
    
    public int getSize()
    {
        return players.size();
    }
    
}
