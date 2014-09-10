package be.bukkit.bungee.staffchat.commands;

import be.bukkit.bungee.staffchat.Main;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;

/**
 * Created by root on 31-8-2014.
 */
public class StaffChatInfo extends Command {
    public StaffChatInfo(Main instance) {
        super("scinfo");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "StaffChat version v" + ChatColor.DARK_GREEN + Main.currentVersion);
        sender.sendMessage(ChatColor.DARK_AQUA + "Plugin by " + ChatColor.AQUA + "WoutDev");
    }
}