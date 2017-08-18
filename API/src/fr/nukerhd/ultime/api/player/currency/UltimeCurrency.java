package fr.nukerhd.ultime.api.player.currency;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimeCurrency
{
    
    private float coins;
    private float ultimeCoins;
    
    public UltimeCurrency(
            float coins,
            float ultimeCoins)
    {
        this.coins = coins;
        this.ultimeCoins = ultimeCoins;
    }
    
    public float getCoins()
    {
        return coins;
    }
    
    public float getUltimeCoins()
    {
        return ultimeCoins;
    }
    
    public void setCoins(float coins)
    {
        this.coins = coins;
    }
    
    public void setUltimeCoins(float ultimeCoins)
    {
        this.ultimeCoins = ultimeCoins;
    }
    
    public void addCoins(float coins)
    {
        this.coins = coins + coins;
    }
    
    public void addUltimeCoins(float ultimeCoins)
    {
        this.coins = ultimeCoins + ultimeCoins;
    }
    
    public void removeCoins(float coins)
    {
        this.coins = coins - coins;
    }
    
    public void removeUltimeCoins(float ultimeCoins)
    {
        this.coins = ultimeCoins - ultimeCoins;
    }
    
}
