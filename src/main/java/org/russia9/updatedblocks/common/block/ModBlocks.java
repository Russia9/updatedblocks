package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.russia9.updatedblocks.common.item.ItemBlockStone;

public class ModBlocks {
    public static Block stone;
    public static Block bone;

    public static final void init() {
        //1.8
        GameRegistry.registerBlock(bone = new BlockBone("bone_block", Material.rock), "bone_block");
        GameRegistry.registerBlock(stone = new BlockStone("stone", Material.rock), ItemBlockStone.class, "stone");
    }
}
