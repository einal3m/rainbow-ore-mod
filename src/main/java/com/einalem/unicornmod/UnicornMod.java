package com.einalem.unicornmod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = UnicornMod.MODID, name = UnicornMod.MODNAME, version = UnicornMod.VERSION)
public class UnicornMod
{
  public static final String MODID = "unicornmod";
  public static final String VERSION = "1.0";
  public static final String MODNAME = "Unicorn Mod";

  @SidedProxy(clientSide = "com.einalem.unicornmod.ClientProxy", serverSide = "com.einalem.unicornmod.ServerProxy")
  public static CommonProxy proxy;

  @Mod.Instance
  public static UnicornMod instance;

  public static Logger logger;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    logger = event.getModLog();
    proxy.preInit(event);
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent e) {
    proxy.init(e);
    System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e) {
    proxy.postInit(e);
  }
}
