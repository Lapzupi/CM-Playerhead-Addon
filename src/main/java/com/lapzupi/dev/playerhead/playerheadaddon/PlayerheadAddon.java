package com.lapzupi.dev.playerhead.playerheadaddon;

import com.lapzupi.dev.configurablemenus.addons.ItemAddon;
import de.tr7zw.changeme.nbtapi.NBTCompound;
import de.tr7zw.changeme.nbtapi.NBTItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PlayerheadAddon extends ItemAddon {

    @Override
    public ItemStack getItemStack(final String id) {
        return getFromPlayerHead(id);
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getPrefix() {
        return "playerhead";
    }

    @Contract(pure = true)
    @Override
    public @Nullable String getPluginName() {
        return null;
    }

    @Override
    public boolean canRegister() {
        return true;
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getAuthor() {
        return "Lapzupi Development Team";
    }

    @Contract(pure = true)
    @Override
    public @NotNull String getVersion() {
        return "1.0.1";
    }

    private ItemStack getFromPlayerHead(final String playerName) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
        NBTItem nbti = new NBTItem(head);

        NBTCompound skull = nbti.addCompound("SkullOwner");
        skull.setString("Name", playerName);

        return nbti.getItem();
    }

    @Override
    public String getUrl() {
        return "https://github.com/Lapzupi/CM-Playerhead-Addon/releases";
    }
}
