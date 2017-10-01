package com.einalem.rainboworemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FirstBlock extends Block {
  public FirstBlock() {
    super(Material.ROCK);
    setUnlocalizedName(RainbowOreMod.MODID + ".firstblock");     // Used for localization (en_US.lang)
    setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
    setCreativeTab(CreativeTabs.MISC);
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
