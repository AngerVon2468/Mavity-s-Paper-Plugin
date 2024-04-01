package net.mavity.mavpapertestone;

import net.mavity.mavpapertestone.commands.WiiUCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Mav_PaperTest_One extends JavaPlugin {
    private static Mav_PaperTest_One instance;
    public static Mav_PaperTest_One getInstance() {
        return instance;
    }
    public static final String MOD_ID = "mavpapertestone";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onEnable() {
        // Plugin startup logic
        LOGGER.info(Mav_PaperTest_One.MOD_ID + " has started up.");
        instance = this;
        getCommand("wiiu").setExecutor(new WiiUCommand());
        WiiUCommand.registerWiiUCommand();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info(Mav_PaperTest_One.MOD_ID + " has shut down.");
    }

}
