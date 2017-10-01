package com.einalem.unicornmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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
    event.getRegistry().register(new FirstBlock());
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    System.out.println("common proxy: registerItems");
    event.getRegistry().register(
        new ItemBlock(ModBlocks.firstBlock).setRegistryName(ModBlocks.firstBlock.getRegistryName())
    );

    event.getRegistry().register(new FirstItem());

  }
}
