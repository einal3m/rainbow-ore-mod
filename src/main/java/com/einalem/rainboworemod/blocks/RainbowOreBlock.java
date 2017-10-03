package com.einalem.rainboworemod.blocks;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RainbowOreBlock extends Block {
  public static final String REGISTRY_NAME = "rainbow_ore";

  public RainbowOreBlock() {
    super(Material.ROCK);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
    setRegistryName(REGISTRY_NAME);
    setCreativeTab(CreativeTabs.MISC);
  }
}
