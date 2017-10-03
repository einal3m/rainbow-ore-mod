package com.einalem.rainboworemod.blocks;

import com.einalem.rainboworemod.RainbowOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RainbowBlock extends Block {
  public static final String REGISTRY_NAME = "rainbow_block";

  public RainbowBlock() {
    super(Material.IRON, MapColor.DIAMOND);
    setUnlocalizedName(RainbowOreMod.MODID + "." + REGISTRY_NAME);
    setRegistryName(REGISTRY_NAME);
    setHardness(5.0F);
    setResistance(10.0F);
    setSoundType(SoundType.METAL);
    setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
  }
}
