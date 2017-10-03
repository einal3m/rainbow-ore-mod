package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RainbowIngotItem extends Item {
  public static final String REGISTRY_NAME = "rainbow_ingot";

  public RainbowIngotItem() {
    setRegistryName("rainbow_ingot");
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
    setCreativeTab(CreativeTabs.MISC);
  }
}
