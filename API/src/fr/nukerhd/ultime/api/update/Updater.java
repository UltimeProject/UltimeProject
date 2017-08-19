package fr.nukerhd.ultime.api.update;

import fr.nukerhd.ultime.api.plugin.UltimePlugin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public class Updater
{
    
    private UltimePlugin plugin;
    
    private String latestVersion;
    
    private final String LATEST_VERSION_URL = "http://nukerhd.esy.es/UltimeProject/";
    
    
    public Updater(UltimePlugin plugin)
    {
        while(latestVersion == null)
            checkUpdate();
    }
    
    public void checkUpdate()
    {
        if(latestVersion != null)
            return;
        try
        {
    
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(LATEST_VERSION_URL).openStream()));
            String         line;
            while ((line = reader.readLine()) != null)
            {
                latestVersion = line;
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public boolean isLatest()
    {
        return plugin.getPluginInfos().getVersion().equals(latestVersion);
    }
    
}
