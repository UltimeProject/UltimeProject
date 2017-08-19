package fr.nukerhd.ultime.api.translate;

import fr.nukerhd.ultime.api.player.UltimePlayer;
import fr.nukerhd.ultime.api.translate.language.FrenchLanguage;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public class Translator
{
    
    
    public String getString(UltimePlayer player, String name)
    {
        switch (player.getLang())
        {
            case FRENCH:
                for (FrenchLanguage language : FrenchLanguage.values())
                {
                    if (language.getMessageName().equals(name))
                        return language.getMessage();
                }
                break;
            case ENGLISH:
                
                break;
        }
        return null;
    }
    
}
