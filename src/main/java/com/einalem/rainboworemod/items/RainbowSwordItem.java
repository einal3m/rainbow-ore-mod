package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RainbowSwordItem extends ItemSword {
  public RainbowSwordItem(Item.ToolMaterial material) {
    super(material);
    setRegistryName("rainbow_sword");
    setUnlocalizedName(RainbowOreMod.MODID + ".rainbow_sword");
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
