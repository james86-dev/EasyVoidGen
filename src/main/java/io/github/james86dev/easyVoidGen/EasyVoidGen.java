package io.github.james86dev.easyVoidGen;

import org.bukkit.plugin.java.JavaPlugin;

public final class EasyVoidGen extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin started!");

    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin stopped!");
    }
}
