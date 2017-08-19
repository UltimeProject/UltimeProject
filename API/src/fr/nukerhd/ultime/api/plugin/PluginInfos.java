package fr.nukerhd.ultime.api.plugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class PluginInfos
{
    
    private String       name;
    private String       version;
    private String       website;
    private String       description;
    private List<String> authors;
    
    public PluginInfos(JavaPlugin plugin)
    {
        this.name = plugin.getDescription().getName();
        this.version = plugin.getDescription().getVersion();
        this.website = plugin.getDescription().getWebsite();
        this.description = plugin.getDescription().getDescription();
        this.authors = plugin.getDescription().getAuthors();
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getVersion()
    {
        return version;
    }
    
    public String getWebsite()
    {
        return website;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public List<String> getAuthors()
    {
        return authors;
    }
    
}
