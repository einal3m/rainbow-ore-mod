package com.einalem.rainboworemod.items;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RainbowSwordItem extends Item {
  public RainbowSwordItem() {
    setRegistryName("rainbow_sword");        // The unique name (within your mod) that identifies this item
    setUnlocalizedName(RainbowOreMod.MODID + ".rainbow_sword");     // Used for localization (en_US.lang)
    setCreativeTab(CreativeTabs.MISC);
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
