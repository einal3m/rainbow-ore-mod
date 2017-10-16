package com.einalem.rainbowore;

import com.einalem.rainbowore.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = RainbowOreMod.MODID, name = RainbowOreMod.MODNAME, version = RainbowOreMod.VERSION)
public class RainbowOreMod
{
  public static final String MODID = "rainbowore";
  public static final String VERSION = "1.0";
  public static final String MODNAME = "Rainbow Ore Mod";

  @SidedProxy(clientSide = "com.einalem.rainbowore.proxy.ClientProxy", serverSide = "com.einalem.rainbowore.proxy.ServerProxy")
  public static CommonProxy proxy;

  @Mod.Instance
  public static RainbowOreMod instance;

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
