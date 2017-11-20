package org.russia9.updatedblocks.lib;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.oredict.OreDictionary;
import org.russia9.updatedblocks.UpdatedBlocks;

import java.util.ArrayList;

public class Utils {

    public static String getUnlocalisedName(String name) {
        return UpdatedBlocks.MODID + "." + name;
    }

    public static String getBlockTexture(String name) {
        return UpdatedBlocks.ITEM_BLOCK_TEXTURE_PATH + name;
    }

    public static String getItemTexture(String name) {
        return UpdatedBlocks.ITEM_BLOCK_TEXTURE_PATH + name;
    }

    public static ResourceLocation getResource(String path) {
        return new ResourceLocation(path);
    }

    public static String getConainerName(String name) {
        return "container." + UpdatedBlocks.MODID + "." + name;
    }

    @SuppressWarnings("unchecked")
    public static <T> T getTileEntity(IBlockAccess world, int x, int y, int z, Class<T> cls) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (!cls.isInstance(tile))
            return null;
        return (T) tile;
    }

    public static ArrayList<String> getOreNames(ItemStack stack) {
        ArrayList<String> list = new ArrayList<String>();
        for (int id : OreDictionary.getOreIDs(stack))
            list.add(OreDictionary.getOreName(id));

        return list;
    }
}