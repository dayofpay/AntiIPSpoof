package me.dayofpay.magmaantiop;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.MagmaCube;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.List;
import java.util.List;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void lHandle(PlayerLoginEvent event) {
        if (!event.equals(Main.getInstance().getConfig().getString("server-ip").split(":")[0])) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER,
                    ChatColor.translateAlternateColorCodes('&',
                            "&e" + event.getHostname().split(":")[0] + " &cне е \n"
                                    + "позволен адрес.\n"
                                    + "&f\n"
                                    + "&cМоля, пробвайте със &e&o" + Main.getInstance().getConfig().getString("server-ip")));
        }

        }
}