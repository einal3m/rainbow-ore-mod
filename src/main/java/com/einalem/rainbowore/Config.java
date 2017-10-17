package com.einalem.rainbowore;

import com.einalem.rainbowore.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

public class Config {

  private static final String CATEGORY_ORE_GEN = "ore generation";

  public static boolean oreGenerationEnabled = true;
  public static int oreMinHeight = 0;
  public static int oreMaxHeight = 16;
  public static int oreVeinsPerChunk = 1;
  public static int oreVeinSize = 6;

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
    cfg.addCustomCategoryComment(CATEGORY_ORE_GEN, "Overworld ore generation configuration");

    oreGenerationEnabled = cfg.getBoolean("rainbowOreWorldGenEnabled", CATEGORY_ORE_GEN, oreGenerationEnabled, "Enable world generation of rainbow ore");
    oreMinHeight = cfg.getInt("rainbowOreMinHeight", CATEGORY_ORE_GEN, oreMinHeight, 0, 256, "Minimum height (Y coordinate) in the world to generate rainbow ore");
    oreMaxHeight = cfg.getInt("rainbowOreMaxHeight", CATEGORY_ORE_GEN, oreMaxHeight, 0, 256, "Maximum height (Y coordinate) in the world to generate rainbow ore");
    oreVeinsPerChunk = cfg.getInt("rainbowOreVeinsPerChunk", CATEGORY_ORE_GEN, oreVeinsPerChunk, 0, 100, "How many times can a rainbow ore vein spawn in each chunk");
    oreVeinSize = cfg.getInt("rainbowOreVeinSize", CATEGORY_ORE_GEN, oreVeinSize, 0, 100, "How many rainbow ore in each vein");
  }
}
