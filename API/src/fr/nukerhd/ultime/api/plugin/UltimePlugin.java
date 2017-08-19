package fr.nukerhd.ultime.api.plugin;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimePlugin
        extends JavaPlugin
{

    private PluginInfos pluginInfos;
    
    @Override
    public void onEnable()
    {
        super.onEnable();
    }
    
    private void initialize()
    {
        pluginInfos = new PluginInfos(this);
    }
    
    public PluginInfos getPluginInfos()
    {
        return pluginInfos;
    }
}
