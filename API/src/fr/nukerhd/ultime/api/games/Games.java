package fr.nukerhd.ultime.api.games;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public enum Games
{
    
    KIT_PVP("Kit PvP", "NukerHD");
    
    private String name, developper;
    
    Games(String name, String developper)
    {
        this.name = name;
        this.developper = developper;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getDevelopper()
    {
        return developper;
    }
}
