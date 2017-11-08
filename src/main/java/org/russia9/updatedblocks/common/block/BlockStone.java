package org.russia9.updatedblocks.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import org.russia9.updatedblocks.updatedBlocks;

import java.util.List;

public class BlockStone extends Block {
    private IIcon[] iIcons;

    BlockStone(String unlocalizedName, Material material) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.5F);
        this.setResistance(30F);
        this.setStepSound(soundTypeStone);
        this.setBlockTextureName(updatedBlocks.MODID + ":" + unlocalizedName);

        iIcons = new IIcon[6];
    }

    @Override
    public void registerBlockIcons(IIconRegister register) { //iIcons[i] = register.registerIcon(this.textureName + "_" + "top");
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "granite");
                    break;
                case 1:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "granite_smooth");
                    break;
                case 2:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "diorite");
                    break;
                case 3:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "diorite_smooth");
                    break;
                case 4:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "andesite");
                    break;
                case 5:
                    iIcons[i] = register.registerIcon(this.textureName + "_" + "andesite_smooth");
                    break;
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (meta > 6)
            meta = 0;

        return iIcons[meta];
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < 6; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
