package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.Utils;

public class PrismarineBlock extends BlockGeneric implements IConfigurable {
    public PrismarineBlock() {
        super(Material.rock, "rough", "bricks", "dark");
        setHardness(1.5F);
        setResistance(10.0F);
        setBlockTextureName("prismarine");
        setBlockName(Utils.getUnlocalisedName("prismarine_block"));
        setCreativeTab(UpdatedBlocks.enablePrismarine ? CreativeTabs.tabBlock : null);
    }

    @SideOnly(Side.CLIENT)
    public void setIcon(int index, IIcon icon) {
        if (iIcons == null)
            iIcons = new IIcon[types.length];

        iIcons[index] = icon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        if (iIcons == null)
            iIcons = new IIcon[types.length];

        for (int i = 0; i < types.length; i++)
            if ("".equals(types[i]))
                iIcons[i] = reg.registerIcon(UpdatedBlocks.MODID + ":" + getTextureName());
            else
                iIcons[i] = reg.registerIcon(UpdatedBlocks.MODID + ":" + getTextureName() + "_" + types[i]);
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enablePrismarine;
    }
}
