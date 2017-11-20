package org.russia9.updatedblocks.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.russia9.updatedblocks.CommonProxy;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.client.render.block.SlimeBlockRender;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        if (UpdatedBlocks.enableSlimeBlock)
            RenderingRegistry.registerBlockHandler(new SlimeBlockRender());
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    @Override
    public void registerRenderers() {
        super.registerRenderers();
    }
}
