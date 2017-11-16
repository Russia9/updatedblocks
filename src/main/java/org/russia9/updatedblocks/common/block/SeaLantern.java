package org.russia9.updatedblocks.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import org.russia9.updatedblocks.IConfigurable;
import net.minecraft.block.Block;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class SeaLantern extends Block implements IConfigurable {
    protected SeaLantern() {
        super(Material.glass);
        setHardness(0.3F);
        setLightLevel(1.0F);
        setStepSound(soundTypeGlass);
        setBlockTextureName(UpdatedBlocks.MODID + ":" + "sea_lantern");
        setBlockName(Utils.getUnlocalisedName("sea_lantern"));
        setCreativeTab(UpdatedBlocks.enablePrismarine ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enablePrismarine;
    }
}
