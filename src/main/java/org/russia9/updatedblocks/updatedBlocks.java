package org.russia9.updatedblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "updatedblocks",name = "Updated Blocks")
public class updatedBlocks {
    @SidedProxy(clientSide = "org.russia9.updatedblocks.client.ClientProxy", serverSide = "org.russia9.updatedblocks.common.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "updatedblocks";
    public static final String VERSION = "1.0 SNAPSHOT";


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
