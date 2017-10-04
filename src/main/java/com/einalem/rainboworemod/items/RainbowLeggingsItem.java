package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class RainbowLeggingsItem extends ItemArmor {
  public static final String REGISTRY_NAME = "rainbow_leggings";

  public RainbowLeggingsItem () {
    super(ItemArmor.ArmorMaterial.valueOf("RAINBOW"), 0, EntityEquipmentSlot.LEGS);
    setRegistryName(REGISTRY_NAME);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
  }

  @Nullable
  @Override
  public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
    return RainbowOreMod.MODID + ":textures/models/armor/rainbow_layer_2.png";
  }
}
