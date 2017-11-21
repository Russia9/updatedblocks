package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class RedSandstoneStairs extends BlockStairs implements IConfigurable {
    protected RedSandstoneStairs() {
        super(ModBlocks.redSandstone, 0);
        setHardness(0.8F);
        setLightOpacity(0);
        setBlockName(Utils.getUnlocalisedName("red_sandstone_stairs"));
        setCreativeTab(UpdatedBlocks.enableRedSandstone ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableRedSandstone;
    }
}
