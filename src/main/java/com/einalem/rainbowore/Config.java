package com.einalem.rainbowore;

import com.einalem.rainbowore.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

  private static final String CATEGORY_GENERAL = "general";

  public static boolean oreGenerationEnabled = true;

  public static void readConfig() {
    Configuration cfg = CommonProxy.config;
    try {
      cfg.load();
      initGeneralConfig(cfg);
    } catch (Exception e1) {
      RainbowOreMod.logger.log(Level.ERROR, "Problem loading config file!", e1);
    } finally {
      if (cfg.hasChanged()) {
        cfg.save();
      }
    }
  }

  private static void initGeneralConfig(Configuration cfg) {
    cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");

    oreGenerationEnabled = cfg.getBoolean("rainbowOreWorldGenEnabled", CATEGORY_GENERAL, oreGenerationEnabled, "Enable world generation of rainbow ore");
  }
}
