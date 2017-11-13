package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class Stone extends BlockGeneric implements IConfigurable {
    public static final int GRANITE = 1;
    public static final int POLISHED_GRANITE = 2;
    public static final int DIORITE = 3;
    public static final int POLISHED_DIORITE = 4;
    public static final int ANDESITE = 5;
    public static final int POLISHED_ANDESITE = 6;

    public Stone() {
        super(Material.rock, "", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth");
        startMeta = 1;
        setHardness(1.5F);
        setResistance(10.0F);
        setBlockTextureName("stone");
        setStepSound(soundTypePiston);
        setBlockName(Utils.getUnlocalisedName("stone"));
        setCreativeTab(UpdatedBlocks.enableStones ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isReplaceableOreGen(World world, int x, int y, int z, Block target) {
        return this == target || target == Blocks.stone;
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableStones;
    }
}
