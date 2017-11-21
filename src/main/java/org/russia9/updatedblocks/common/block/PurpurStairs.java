package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PurpurStairs extends BlockStairs implements IConfigurable {
    protected PurpurStairs() {
        super(ModBlocks.purpurBlock, 0);
        setHardness(0.8F);
        setLightOpacity(0);
        setBlockName(Utils.getUnlocalisedName("purpur_stairs"));
        setCreativeTab(UpdatedBlocks.enableChorusFruit ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableChorusFruit;
    }
}
