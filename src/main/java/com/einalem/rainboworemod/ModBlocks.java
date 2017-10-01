package com.einalem.rainboworemod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":rainbow_ore")
  public static RainbowOreBlock rainbowOreBlock;

  @SideOnly(Side.CLIENT)
  public static void initModels() {
    rainbowOreBlock.initModel();
  }
}