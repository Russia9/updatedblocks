package org.russia9.updatedblocks.common.block;

import net.minecraft.block.BlockSandStone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.common.item.block.ItemBlockRedSandstone;
import org.russia9.updatedblocks.lib.Utils;

public class RedSandstone extends BlockSandStone implements ModBlocks.ISubBlocksBlock, IConfigurable {

    public RedSandstone() {
        setHardness(0.8F);
        setBlockTextureName(UpdatedBlocks.MODID + ":" + "red_sandstone");
        setBlockName(Utils.getUnlocalisedName("red_sandstone"));
        setCreativeTab(UpdatedBlocks.enableRedSandstone ? CreativeTabs.tabBlock : null);
    }

    @Override
    public Class<? extends ItemBlock> getItemBlockClass() {
        return ItemBlockRedSandstone.class;
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableRedSandstone;
    }
}

