package fr.nukerhd.ultime.api.translate.language;

/**
 * Crée le 19/08/2017 par NukerHD pour UltimeProject !
 */
public enum FrenchLanguage
{
    
    NO_PERMISSION("no.permission", "§cVous n'avez pas accès à cette commande."),
    RANK_COMMAND("rank.show", "§2Vous êtes <rank>."),
    COINS_COMMAND("coins.show", "§2Vous avez <coins> Coins."),
    ULTIMECOINS_COMMAND("ultimecoins.show", "§2Vous avez <ultimecoins> Ultime Coins.");
    
    private String messageName, message;
    
    FrenchLanguage(String messageName, String message)
    {
        this.messageName = messageName;
        this.message = message;
    }
    
    public String getMessageName()
    {
        return messageName;
    }
    
    public String getMessage()
    {
        return message;
    }
}
