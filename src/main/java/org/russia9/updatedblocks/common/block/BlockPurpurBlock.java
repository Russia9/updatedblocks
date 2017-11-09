package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.UpdatedBlocks;

public class BlockPurpurBlock extends Block {

    protected BlockPurpurBlock(String unlocalizedName, Material material) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(UpdatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5F);
        this.setResistance(30F);
        this.setHarvestLevel("pickaxe", 1);
    }
}
