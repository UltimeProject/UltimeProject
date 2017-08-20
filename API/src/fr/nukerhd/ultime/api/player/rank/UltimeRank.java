package fr.nukerhd.ultime.api.player.rank;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public enum UltimeRank
{
    ADMIN("[Admin] ",
          "",
          100),
    RESP("[Resp] ",
         "",
         80),
    DEV("[Dev] ",
        "",
        75),
    MOD("[Mod] ",
        "",
        50),
    HELPER("",
           "",
           45),
    STAFF("",
          "",
          40),
    LEGENDARY("[Légendaire] ",
              "",
              20),
    ULTIMATE("[Ultime] ",
             "",
             5),
    PLAYER("§9",
           "",
           0);
    
    private String prefix, suffix;
    private int power;
    
    UltimeRank(
            String prefix,
            String suffix,
            int power)
    {
        this.prefix = prefix;
        this.suffix = suffix;
        this.power = power;
    }
    
    public String getPrefix()
    {
        return prefix;
    }
    
    public String getSuffix()
    {
        return suffix;
    }
    
    public int getPower()
    {
        return power;
    }
}
