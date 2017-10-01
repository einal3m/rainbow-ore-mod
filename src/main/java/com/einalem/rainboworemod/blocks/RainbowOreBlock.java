package com.einalem.rainboworemod.blocks;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RainbowOreBlock extends Block {
  public RainbowOreBlock() {
    super(Material.ROCK);
    setUnlocalizedName(RainbowOreMod.MODID + ".rainbow_ore");     // Used for localization (en_US.lang)
    setRegistryName("rainbow_ore");        // The unique name (within your mod) that identifies this block
    setCreativeTab(CreativeTabs.MISC);
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
