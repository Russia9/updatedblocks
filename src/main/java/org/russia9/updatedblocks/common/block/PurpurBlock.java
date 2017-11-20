package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PurpurBlock extends Block implements IConfigurable {
    protected PurpurBlock() {
        super(Material.rock);
        setHardness(1.5F);
        setResistance(10.0F);
        setStepSound(soundTypePiston);
        setBlockTextureName(UpdatedBlocks.MODID + ":" + "purpur_block");
        setBlockName(Utils.getUnlocalisedName("purpur_block"));
        setCreativeTab(UpdatedBlocks.enableChorusFruit ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableChorusFruit;
    }
}
