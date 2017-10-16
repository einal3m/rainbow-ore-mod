package com.einalem.rainbowore.items;

import com.einalem.rainbowore.RainbowOreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class RainbowSwordItem extends ItemSword {
  public static final String REGISTRY_NAME = "rainbow_sword";

  public RainbowSwordItem(Item.ToolMaterial material) {
    super(material);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }
}
