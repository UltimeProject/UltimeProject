package fr.nukerhd.ultime.api.player.booster;

import fr.nukerhd.ultime.api.games.Games;
import fr.nukerhd.ultime.api.player.UltimePlayer;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimeBooster
{
    
    private UltimePlayer ultimePlayer;
    private Games        game;
    
    private long timeLeft;
    
    public UltimeBooster(UltimePlayer ultimePlayer)
    {
        this.ultimePlayer = ultimePlayer;
    }
    
    public UltimeBooster(UltimePlayer ultimePlayer, Games game)
    {
        this.ultimePlayer = ultimePlayer;
        this.game = game;
    }
    
    public UltimeBooster(UltimePlayer ultimePlayer, Games game, long timeLeft)
    {
        this.ultimePlayer = ultimePlayer;
        this.game = game;
    }
    
    public void setGames(Games game)
    {
        this.game = game;
    }
    
    public void setTimeLeft(long timeLeft)
    {
        this.timeLeft = timeLeft;
    }
    
    public long getTimeLeft()
    {
        return timeLeft;
    }
    
    public Games getGame()
    {
        return game;
    }
    
}
