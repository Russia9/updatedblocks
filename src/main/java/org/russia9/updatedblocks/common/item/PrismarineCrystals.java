package org.russia9.updatedblocks.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PrismarineCrystals extends Item implements IConfigurable{
    public PrismarineCrystals() {
        setTextureName(UpdatedBlocks.MODID + ":" + "prismarine_crystals");
        setUnlocalizedName(Utils.getUnlocalisedName("prismarine_crystals"));
        setCreativeTab(UpdatedBlocks.enablePrismarine ? CreativeTabs.tabMaterials : null);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enablePrismarine;
    }
}
