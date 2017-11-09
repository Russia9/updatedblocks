package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.russia9.updatedblocks.common.item.ItemBlockStone;

public class ModBlocks {
    public static Block stone;
    public static Block bone;
    public static Block endRod, purpurBlock, purpurPilone;

    public static final void init() {
        //1.8
        GameRegistry.registerBlock(bone = new BlockBone("bone_block", Material.rock), "bone_block");
        GameRegistry.registerBlock(stone = new BlockStone("stone", Material.rock), ItemBlockStone.class, "stone");
        //GameRegistry.registerBlock(endRod = new BlockEndRod("end_rod",Material.rock),"end_rod");
        GameRegistry.registerBlock(purpurBlock = new BlockPurpurBlock("purpur_block",Material.rock),"purpur_block");
        GameRegistry.registerBlock(purpurBlock = new BlockPurpurPilone("purpur_pillar",Material.rock),"purpur_pillar");
    }
}
