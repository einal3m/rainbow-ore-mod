package com.einalem.unicornmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
  @GameRegistry.ObjectHolder(UnicornMod.MODID + ":firstitem")
  public static FirstItem firstItem;


  @SideOnly(Side.CLIENT)
  public static void initModels() {
    firstItem.initModel();
  }
}
