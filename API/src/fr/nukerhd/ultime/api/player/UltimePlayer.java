package fr.nukerhd.ultime.api.player;

import org.bukkit.entity.Player;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimePlayer
{
    
    private Player player;
    
    
    public UltimePlayer(Player player)
    {
        this.player = player;
    }
    
    public Player getPlayer()
    {
        return player;
    }
}
