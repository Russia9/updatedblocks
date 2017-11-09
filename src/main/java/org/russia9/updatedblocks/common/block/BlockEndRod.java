package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.UpdatedBlocks;

public class BlockEndRod extends Block {
    protected BlockEndRod(String unlocalizedName,Material material) {
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(UpdatedBlocks.MODID + ":" + unlocalizedName);
        this.setBlockBounds(0.1F,0.1F,0.1F,0.1F,0.1F,0.1F);
        this.setHardness(0F);
        this.setResistance(30F);
        this.setLightLevel(14F);
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
}
