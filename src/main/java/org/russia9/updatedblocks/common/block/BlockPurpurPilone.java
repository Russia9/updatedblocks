package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import org.russia9.updatedblocks.UpdatedBlocks;

public class BlockPurpurPilone extends Block {
    public IIcon[] icons;

    protected BlockPurpurPilone(String unlocalizedName, Material material) {
        super(material);
        icons  = new IIcon[6];

        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(UpdatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5F);
        this.setResistance(30F);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        for(int i = 0; i < 6; i++) {
            if(i < 2)
                icons[i] = register.registerIcon(this.textureName + "_top");
            else
                icons[i] = register.registerIcon(this.textureName);
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}
