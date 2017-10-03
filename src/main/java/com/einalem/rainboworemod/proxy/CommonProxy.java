package com.einalem.rainboworemod.proxy;

import com.einalem.rainboworemod.ModBlocks;
import com.einalem.rainboworemod.blocks.RainbowBlock;
import com.einalem.rainboworemod.blocks.RainbowOreBlock;
import com.einalem.rainboworemod.items.RainbowAxeItem;
import com.einalem.rainboworemod.items.RainbowIngotItem;
import com.einalem.rainboworemod.items.RainbowShovelItem;
import com.einalem.rainboworemod.items.RainbowSwordItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
  public void preInit(FMLPreInitializationEvent e) {
    System.out.println("common proxy: preInit");
  }

  public void init(FMLInitializationEvent e) {
    System.out.println("common proxy: init");
  }

  public void postInit(FMLPostInitializationEvent e) {
    System.out.println("common proxy: postInit");
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    System.out.println("common proxy: registerBlocks");
    event.getRegistry().register(new RainbowOreBlock());
    event.getRegistry().register(new RainbowBlock());
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    System.out.println("common proxy: registerItems");

    event.getRegistry().register(
        new ItemBlock(ModBlocks.rainbowOreBlock).setRegistryName(ModBlocks.rainbowOreBlock.getRegistryName())
    );
    event.getRegistry().register(
        new ItemBlock(ModBlocks.rainbowBlock).setRegistryName(ModBlocks.rainbowBlock.getRegistryName())
    );

    EnumHelper.addToolMaterial("RAINBOW", 4, 1500, 8.0F, 4.0F, 25);

    event.getRegistry().register(new RainbowSwordItem(Item.ToolMaterial.valueOf("RAINBOW")));
    event.getRegistry().register(new RainbowShovelItem(Item.ToolMaterial.valueOf("RAINBOW")));
    // spade
    // hoe
    event.getRegistry().register(new RainbowAxeItem(Item.ToolMaterial.valueOf("RAINBOW")));

    event.getRegistry().register(new RainbowIngotItem());
  }
}
