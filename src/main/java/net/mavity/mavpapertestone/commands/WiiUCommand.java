package net.mavity.mavpapertestone.commands;

import net.mavity.mavpapertestone.Mav_PaperTest_One;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WiiUCommand implements CommandExecutor, TabCompleter {
    public static void registerWiiUCommand() {
        Mav_PaperTest_One.LOGGER.info(Mav_PaperTest_One.MOD_ID + " has registered a command called WiiU.");
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage("WiiUWiiUWiiUWiiU");
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return null;
    }
}