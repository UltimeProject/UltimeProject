package fr.nukerhd.ultime.core;

import fr.nukerhd.ultime.api.plugin.PluginInfos;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimeCore
        extends JavaPlugin
{
    
    private PluginInfos pluginInfos;
    
    @Override
    public void onEnable()
    {
        super.onEnable();
        pluginInfos = new PluginInfos(this);
    }
    
    public PluginInfos getPluginInfos()
    {
        return pluginInfos;
    }
}
