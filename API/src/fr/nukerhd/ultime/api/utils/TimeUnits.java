package fr.nukerhd.ultime.api.utils;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public enum TimeUnits
{
    
    SEC("Seconde", "sec", 1),
    MIN("Minute", "min", 60),
    HOUR("Heure", "hour", 60 * 60),
    DAY("Jour", "day", 60 * 60 * 24),
    MONTH("Mois", "month", 60 * 60 * 24 * 30),
    YEAR("Année", "year", 12 * 60 * 60 * 24 * 30);
    
    private String name, shortcut;
    private long seconds;
    
    TimeUnits(String name, String shortcut, long seconds)
    {
        this.name = name;
        this.shortcut = shortcut;
        this.seconds = seconds;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getShortcut()
    {
        return shortcut;
    }
    
    public long getSeconds()
    {
        return seconds;
    }
}
