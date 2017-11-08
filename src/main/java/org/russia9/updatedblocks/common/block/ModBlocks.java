package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.russia9.updatedblocks.common.block.stone.BlockGranite;

public class ModBlocks {
    public static Block granite, graniteSmooth, diorite, dioriteSmooth, andesite, andesiteSmooth;
    public static Block barrier;

    public static final void init() {
        //1.8
        GameRegistry.registerBlock(granite = new BlockGranite("granite", Material.rock), "granite");
        GameRegistry.registerBlock(graniteSmooth = new BlockGranite("granite_smooth", Material.rock), "granite_smooth");
        GameRegistry.registerBlock(diorite = new BlockGranite("diorite", Material.rock), "diorite");
        GameRegistry.registerBlock(dioriteSmooth = new BlockGranite("diorite_smooth", Material.rock), "diorite_smooth");
        GameRegistry.registerBlock(andesite = new BlockGranite("andesite", Material.rock), "andesite");
        GameRegistry.registerBlock(andesiteSmooth = new BlockGranite("andesite_smooth", Material.rock), "andesite_smooth");
        //GameRegistry.registerBlock(barrier = new BlockBarrier("barrier", Material.rock), "barrier");
    }
}
