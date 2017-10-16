package com.einalem.rainbowore.items;

import com.einalem.rainbowore.RainbowOreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class RainbowHoeItem extends ItemHoe {
  public static final String REGISTRY_NAME = "rainbow_hoe";

  public RainbowHoeItem(Item.ToolMaterial material) {
    super(material);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }
}
