package org.russia9.updatedblocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import org.russia9.updatedblocks.common.GenerationManager;
import org.russia9.updatedblocks.common.block.ModBlocks;
import org.russia9.updatedblocks.common.item.ModItems;
import org.russia9.updatedblocks.common.recipe.*;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
        Crafting.init();
        Smelting.init();
        GameRegistry.registerWorldGenerator(new GenerationManager(),0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
