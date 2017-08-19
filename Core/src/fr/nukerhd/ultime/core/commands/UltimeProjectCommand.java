package fr.nukerhd.ultime.core.commands;

import fr.nukerhd.ultime.core.UltimeCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class UltimeProjectCommand
        implements CommandExecutor
{
    
    private UltimeCore core;
    
    private StringBuilder authors = new StringBuilder();
    
    public UltimeProjectCommand(UltimeCore core)
    {
        this.core = core;
        int i = core.getPluginInfos().getAuthors().size();
        for (String author : core.getPluginInfos().getAuthors())
        {
            if(i != 1)
                authors.append(author + ", ");
            else
                authors.append(author);
            i--;
        }
    }
    
    @Override
    public boolean onCommand(
            CommandSender sender,
            Command command,
            String label,
            String[] args)
    {
        sender.sendMessage("§6-----------------------------------");
        sender.sendMessage("§3⋆ Version : §e" + core.getPluginInfos().getVersion());
        sender.sendMessage("§3⋆ Auteurs : §e" + authors.toString());
        sender.sendMessage("§3⋆ Site : §e" + core.getPluginInfos().getWebsite());
        sender.sendMessage("§6-----------------------------------");
        return false;
    }
    
}
