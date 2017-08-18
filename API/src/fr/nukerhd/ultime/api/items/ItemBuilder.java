package fr.nukerhd.ultime.api.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.List;

/**
 * Crée le 18/08/2017 par NukerHD pour UltimeProject !
 */
public class ItemBuilder
{
    
    private ItemStack itemStack;
    
    public ItemBuilder(Material material)
    {
        itemStack = new ItemStack(material);
    }
    
    public ItemBuilder(Material material, int amount)
    {
        itemStack = new ItemStack(material, amount);
    }
    
    public ItemBuilder(Material material, int amount, short data)
    {
        itemStack = new ItemStack(material, amount, data);
    }
    
    public ItemBuilder setDisplayName(String displayName)
    {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemBuilder setLore(List<String> lore)
    {
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return this;
    }
    
    public ItemStack toItemStack()
    {
        return itemStack;
    }
    
}
