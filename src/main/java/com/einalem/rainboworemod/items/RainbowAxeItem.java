package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class RainbowAxeItem extends ItemAxe {
  public static final String REGISTRY_NAME = "rainbow_axe";

  public RainbowAxeItem(Item.ToolMaterial material) {
    super(material, 9.0F, -3.0F);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }
}
