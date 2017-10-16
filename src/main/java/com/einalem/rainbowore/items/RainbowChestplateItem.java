package com.einalem.rainbowore.items;

import com.einalem.rainbowore.RainbowOreMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class RainbowChestplateItem extends ItemArmor {
  public static final String REGISTRY_NAME = "rainbow_chestplate";

  public RainbowChestplateItem() {
    super(ItemArmor.ArmorMaterial.valueOf("RAINBOW"), 0, EntityEquipmentSlot.CHEST);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }

  @Nullable
  @Override
  public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    return RainbowOreMod.MODID + ":textures/models/armor/rainbow_layer_1.png";
  }
}
