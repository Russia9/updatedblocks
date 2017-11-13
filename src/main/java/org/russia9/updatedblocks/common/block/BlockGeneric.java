package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.common.item.block.ItemBlockGeneric;

import java.util.List;

public class BlockGeneric extends Block implements ModBlocks.ISubBlocksBlock{
    @SideOnly(Side.CLIENT)
    protected IIcon[] iIcons;
    protected final String[] types;

    protected int startMeta = 0;

    protected BlockGeneric(Material material, String... types) {
        super(material);
        this.types = types;
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void getSubBlocks(Item item, CreativeTabs tabs, List list) {
        for (int i = startMeta; i < types.length; i++)
            list.add(new ItemStack(item, 1, i));
    }

    public String getNameFor(int meta) {
        return types[Math.max(Math.min(meta, types.length - 1), 0)];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
        return iIcons[Math.max(Math.min(meta, types.length - 1), startMeta)];
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        if (iIcons == null)
            iIcons = new IIcon[types.length];
        iIcons = new IIcon[types.length];
        for (int i = 0; i < types.length; i++)
            if ("".equals(types[i]))
                iIcons[i] = register.registerIcon(UpdatedBlocks.MODID + ":" + getTextureName());
            else
                iIcons[i] = register.registerIcon(UpdatedBlocks.MODID + ":" + getTextureName() + "_" + types[i]);
    }

    @Override
    public Class<? extends ItemBlock> getItemBlockClass() {
        return ItemBlockGeneric.class;
    }
}
