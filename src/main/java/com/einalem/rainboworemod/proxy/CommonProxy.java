package com.einalem.rainboworemod.proxy;

import com.einalem.rainboworemod.ModBlocks;
import com.einalem.rainboworemod.ModItems;
import com.einalem.rainboworemod.blocks.RainbowBlock;
import com.einalem.rainboworemod.blocks.RainbowOreBlock;
import com.einalem.rainboworemod.items.*;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {
  public void preInit(FMLPreInitializationEvent e) {
    System.out.println("common proxy: preInit");
  }

  public void init(FMLInitializationEvent e) {
    System.out.println("common proxy: init");
    GameRegistry.addSmelting(ModBlocks.rainbowOreBlock, new ItemStack(ModItems.rainbowIngotItem), 1.0F);
  }

  public void postInit(FMLPostInitializationEvent e) {
    System.out.println("common proxy: postInit");
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    System.out.println("Register rainbow blocks");
    event.getRegistry().register(new RainbowOreBlock());
    event.getRegistry().register(new RainbowBlock());
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    System.out.println("Register rainbow items");

    event.getRegistry().register(
        new ItemBlock(ModBlocks.rainbowOreBlock).setRegistryName(ModBlocks.rainbowOreBlock.getRegistryName())
    );
    event.getRegistry().register(
        new ItemBlock(ModBlocks.rainbowBlock).setRegistryName(ModBlocks.rainbowBlock.getRegistryName())
    );

    EnumHelper.addToolMaterial("RAINBOW", 4, 1500, 8.0F, 4.0F, 25);

    event.getRegistry().register(new RainbowSwordItem(Item.ToolMaterial.valueOf("RAINBOW")));
    event.getRegistry().register(new RainbowShovelItem(Item.ToolMaterial.valueOf("RAINBOW")));
    event.getRegistry().register(new RainbowHoeItem(Item.ToolMaterial.valueOf("RAINBOW")));
    event.getRegistry().register(new RainbowPickaxeItem(Item.ToolMaterial.valueOf("RAINBOW")));
    event.getRegistry().register(new RainbowAxeItem(Item.ToolMaterial.valueOf("RAINBOW")));

    EnumHelper.addArmorMaterial("RAINBOW", "rainbow", 40, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);

    event.getRegistry().register(new RainbowHelmItem());
    event.getRegistry().register(new RainbowChestplateItem());
    event.getRegistry().register(new RainbowLeggingsItem());
    event.getRegistry().register(new RainbowBootsItem());

    event.getRegistry().register(new RainbowIngotItem());
  }
}
