package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class RedSandstoneSlab extends GenericSlab implements IConfigurable {
    public RedSandstoneSlab() {
        super(Material.rock, ModBlocks.redSandstone);
        setResistance(30);
        setHardness(2.0F);
        setBlockName(Utils.getUnlocalisedName("red_sandstone_slab"));
        setCreativeTab(UpdatedBlocks.enableRedSandstone ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableRedSandstone;
    }
}
