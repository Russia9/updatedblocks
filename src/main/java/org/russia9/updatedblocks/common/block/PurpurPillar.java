package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PurpurPillar extends BlockRotatedPillar implements IConfigurable {
    public PurpurPillar() {
        super(Material.rock);
        setHardness(1.5F);
        setResistance(10.0F);
        setStepSound(soundTypePiston);
        setBlockTextureName(UpdatedBlocks.MODID + ":" + "purpur_pillar");
        setBlockName(Utils.getUnlocalisedName("purpur_pillar"));
        setCreativeTab(UpdatedBlocks.enableChorusFruit ? CreativeTabs.tabBlock : null);
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return !(entity instanceof EntityDragon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    protected IIcon getSideIcon(int side) {
        return blockIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        super.registerBlockIcons(reg);
        field_150164_N = reg.registerIcon(getTextureName() + "_top");
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableChorusFruit;
    }
}
