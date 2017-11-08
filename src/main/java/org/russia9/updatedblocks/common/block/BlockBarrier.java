package org.russia9.updatedblocks.common.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.russia9.updatedblocks.updatedBlocks;

/**
 * Barrier 1.8 block
 */
public class BlockBarrier extends Block {
    protected BlockBarrier(String unlocalizedName, Material material) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setBlockUnbreakable();
        this.setResistance(18000003F);
        this.setLightOpacity(0);
        this.setBlockTextureName(updatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(null);
    }
}
