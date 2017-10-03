package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class RainbowShovelItem extends ItemSpade {
  public static final String REGISTRY_NAME = "rainbow_shovel";

  public RainbowShovelItem(Item.ToolMaterial material) {
    super(material);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }
}
