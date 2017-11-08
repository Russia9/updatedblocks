package org.russia9.updatedblocks.common.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockStone extends ItemBlockWithMetadata {
    public ItemBlockStone(Block block) {
        super(block, block);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return this.getUnlocalizedName() + "_" + itemStack.getItemDamage();
    }
}
