package com.einalem.rainbowore.proxy;

import com.einalem.rainbowore.ModBlocks;
import com.einalem.rainbowore.ModItems;
import com.einalem.rainbowore.RainbowOreMod;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import org.apache.logging.log4j.Level;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

  @SubscribeEvent
  public static void registerModels(ModelRegistryEvent event) {
    RainbowOreMod.logger.log(Level.INFO, "Register models");
    ModBlocks.initModels();
    ModItems.initModels();
  }
}
