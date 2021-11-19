package me.dayofpay.magmaantiop;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.bukkit.ChatColor;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;

public final class Main extends JavaPlugin {
    private static Main plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        System.out.println(ChatColor.GREEN + "[MagmaAntiOP] Zareden uspeshno...");
        this.getServer().getPluginManager().registerEvents(new Listener(), this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        String allowedServer = getConfig().getString("server-ip");
        String nonAllowedServer = getConfig().getString("disable-ip");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.DARK_GREEN + "[MagmaAntiOP] Plugina e izkluchen...");
    }


    public static Main getInstance() {
        return plugin;
    }
}
