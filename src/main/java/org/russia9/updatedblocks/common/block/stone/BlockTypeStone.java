package org.russia9.updatedblocks.common.block.stone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.updatedBlocks;

/**
 * Class of blocks similar of the stone
 */
public class BlockTypeStone extends Block {
    /**
     * Constructor of the blocks class like stone.
     *
     * @param unlocalizedName unlocalized name of the block
     * @param material material from which the block is made
     */
    public BlockTypeStone(String unlocalizedName, Material material) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5F);
        this.setHarvestLevel("pickaxe", 0);
        this.setResistance(30F);
        this.setStepSound(soundTypeStone);

        this.setBlockTextureName(updatedBlocks.MODID + ":" + "stone_" + unlocalizedName);
    }
}
