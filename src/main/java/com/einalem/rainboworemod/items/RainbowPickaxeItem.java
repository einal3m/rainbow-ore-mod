package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class RainbowPickaxeItem extends ItemPickaxe {
  public static final String REGISTRY_NAME = "rainbow_pickaxe";

  public RainbowPickaxeItem(Item.ToolMaterial material) {
    super(material);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }
}
