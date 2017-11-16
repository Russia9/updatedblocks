package org.russia9.updatedblocks.common.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import org.russia9.updatedblocks.IConfigurable;
import net.minecraft.block.Block;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.common.item.ModItems;
import org.russia9.updatedblocks.lib.Utils;

import java.util.Random;

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
    public int quantityDropped(Random random) {
        return 2 + random.nextInt(2);
    }

    @Override
    public int quantityDroppedWithBonus(int fortune, Random random) {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 5);
    }

    @Override
    public Item getItemDropped(int meta, Random rand, int fortune) {
        return ModItems.prismarineCrystals;
    }

    @Override
    public MapColor getMapColor(int meta) {
        return MapColor.quartzColor;
    }

    @Override
    protected boolean canSilkHarvest() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enablePrismarine;
    }


}
