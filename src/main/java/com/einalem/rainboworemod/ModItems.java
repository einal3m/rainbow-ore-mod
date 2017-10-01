package com.einalem.rainboworemod;

import com.einalem.rainboworemod.items.RainbowSwordItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":rainbow_sword")
  public static RainbowSwordItem rainbowSwordItem;


  @SideOnly(Side.CLIENT)
  public static void initModels() {
    rainbowSwordItem.initModel();
  }
}
