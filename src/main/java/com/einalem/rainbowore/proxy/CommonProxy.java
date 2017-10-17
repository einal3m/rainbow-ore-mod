package com.einalem.rainbowore.proxy;

import com.einalem.rainbowore.Config;
import com.einalem.rainbowore.ModBlocks;
import com.einalem.rainbowore.ModItems;
import com.einalem.rainbowore.RainbowOreMod;
import com.einalem.rainbowore.blocks.RainbowBlock;
import com.einalem.rainbowore.blocks.RainbowOreBlock;
import com.einalem.rainbowore.items.*;
import com.einalem.rainbowore.worldgen.RainbowOreWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Level;

@Mod.EventBusSubscriber
public class CommonProxy {

  public static Configuration config;

  public void preInit(FMLPreInitializationEvent e) {
    RainbowOreMod.logger.log(Level.INFO, "Load config file");
    config = new Configuration(e.getSuggestedConfigurationFile());
    Config.readConfig();
  }

  public void init(FMLInitializationEvent e) {
    RainbowOreMod.logger.log(Level.INFO, "Add smelting recipes");
    GameRegistry.addSmelting(ModBlocks.rainbowOreBlock, new ItemStack(ModItems.rainbowIngotItem), 1.0F);

    if (Config.oreGenerationEnabled) {
      RainbowOreMod.logger.log(Level.INFO, "Register rainbow ore gen");
      GameRegistry.registerWorldGenerator(new RainbowOreWorldGenerator(), 3);
    }
  }

  public void postInit(FMLPostInitializationEvent e) {
  }

  @SubscribeEvent
  public static void registerBlocks(RegistryEvent.Register<Block> event) {
    RainbowOreMod.logger.log(Level.INFO, "Register blocks");
    event.getRegistry().register(new RainbowOreBlock());
    event.getRegistry().register(new RainbowBlock());
  }

  @SubscribeEvent
  public static void registerItems(RegistryEvent.Register<Item> event) {
    RainbowOreMod.logger.log(Level.INFO, "Register items");

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
