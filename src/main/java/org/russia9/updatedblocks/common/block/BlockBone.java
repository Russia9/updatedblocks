package org.russia9.updatedblocks.common.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import org.russia9.updatedblocks.updatedBlocks;

public class BlockBone extends Block {
    private IIcon[] icons = new IIcon[6];

    BlockBone(String unlocalizedName, Material material) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(2.0F);
        this.setResistance(10F);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName(updatedBlocks.MODID + ":" + unlocalizedName);
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        for (int i = 0; i < 6; i ++) {
            if(i < 2) {
                this.icons[i] = register.registerIcon(this.textureName + "_" + "top");
            } else {
                this.icons[i] = register.registerIcon(this.textureName + "_" + "side");
            }
        }
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }
}
