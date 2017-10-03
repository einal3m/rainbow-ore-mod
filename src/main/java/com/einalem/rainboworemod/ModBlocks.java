package com.einalem.rainboworemod;

import com.einalem.rainboworemod.blocks.RainbowBlock;
import com.einalem.rainboworemod.blocks.RainbowOreBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowOreBlock.REGISTRY_NAME)
  public static RainbowOreBlock rainbowOreBlock;

  @GameRegistry.ObjectHolder(RainbowOreMod.MODID + ":" + RainbowBlock.REGISTRY_NAME)
  public static RainbowBlock rainbowBlock;

  @SideOnly(Side.CLIENT)
  public static void initModels() {
    initModel(rainbowOreBlock);
    initModel(rainbowBlock);
  }

  @SideOnly(Side.CLIENT)
  private static void initModel(Block block) {
    ModelLoader.setCustomModelResourceLocation(
      Item.getItemFromBlock(block),
      0,
      new ModelResourceLocation(block.getRegistryName(), "inventory")
    );
  }
}
