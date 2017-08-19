package fr.nukerhd.ultime.api.translate.language;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public enum FrenchLanguage
{
    
    NO_PERMISSION("no.permission", "§cVous n'avez pas accès à cette commande."),
    COINS_COMMAND("coins.show", "§2Vous avez <coins> Coins."),
    ULTIMECOINS_COMMAND("ultimecoins.show", "§2Vous avez <ultimecoins> Ultime Coins.");
    
    private String name, message;
    
    FrenchLanguage(String name, String message)
    {
        this.name = name;
        this.message = message;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getMessage()
    {
        return message;
    }
}
