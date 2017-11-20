package org.russia9.updatedblocks;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.russia9.updatedblocks.common.block.ModBlocks;
import org.russia9.updatedblocks.common.item.ModItems;
import org.russia9.updatedblocks.common.recipe.ModRecipes;


public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModBlocks.init();
    }

    public void init(FMLInitializationEvent e) {
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    public void registerRenderers() {

    }
}
