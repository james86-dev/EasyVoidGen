package io.github.james86dev.easyVoidGen;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class EasyVoidGen extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin started!");
        getLogger().info("crysis hi"); //das ist meine änderung grade

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin stopped!");
    }
    @Override
    public VoidGen getDefaultWorldGenerator(@NotNull String worldName, String id) {
        return new VoidGen(); }
}
