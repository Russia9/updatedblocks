package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PurpurSlab extends GenericSlab {
    public PurpurSlab() {
        super(Material.rock, ModBlocks.purpurBlock);
        setResistance(30);
        setHardness(2.0F);
        setBlockName(Utils.getUnlocalisedName("purpur_slab"));
        setCreativeTab(UpdatedBlocks.enableChorusFruit ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return !(entity instanceof EntityDragon);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableChorusFruit;
    }
}
