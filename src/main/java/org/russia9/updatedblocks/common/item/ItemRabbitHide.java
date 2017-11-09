package org.russia9.updatedblocks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.russia9.updatedblocks.UpdatedBlocks;

class ItemRabbitHide extends Item {
    ItemRabbitHide(String unlocalizedName) {
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(UpdatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
