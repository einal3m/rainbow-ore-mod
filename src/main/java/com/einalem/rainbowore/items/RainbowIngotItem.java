package com.einalem.rainbowore.items;

import com.einalem.rainbowore.RainbowOreMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RainbowIngotItem extends Item {
  public static final String REGISTRY_NAME = "rainbow_ingot";

  public RainbowIngotItem() {
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
    setCreativeTab(CreativeTabs.MISC);
  }
}
