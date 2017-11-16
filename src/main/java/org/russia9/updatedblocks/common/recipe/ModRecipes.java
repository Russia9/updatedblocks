package org.russia9.updatedblocks.common.recipe;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.common.block.ModBlocks;
import org.russia9.updatedblocks.common.block.Stone;
import org.russia9.updatedblocks.common.item.ModItems;

public final class ModRecipes {
    public static final void init() {
        if (UpdatedBlocks.enableSlimeBlock) {
            addShapedRecipe(new ItemStack(ModBlocks.slimeBlock), "xxx", "xxx", "xxx", 'x', "slimeball");
            addShapelessRecipe(new ItemStack(Items.slime_ball, 9), ModBlocks.slimeBlock);
        }
        if (UpdatedBlocks.enableStones) {
            addShapedRecipe(new ItemStack(ModBlocks.stone, 2, Stone.DIORITE), "xy", "yx", 'x', new ItemStack(Blocks.cobblestone), 'y', "gemQuartz");
            addShapedRecipe(new ItemStack(ModBlocks.stone, 4, Stone.POLISHED_DIORITE), "xx", "xx", 'x', "stoneDiorite");
            addShapelessRecipe(new ItemStack(ModBlocks.stone, 2, Stone.ANDESITE), new ItemStack(Blocks.cobblestone), "stoneDiorite");
            addShapedRecipe(new ItemStack(ModBlocks.stone, 4, Stone.POLISHED_ANDESITE), "xx", "xx", 'x', "stoneAndesite");
            addShapelessRecipe(new ItemStack(ModBlocks.stone, 2, Stone.GRANITE), "gemQuartz", "stoneDiorite");
            addShapedRecipe(new ItemStack(ModBlocks.stone, 4, Stone.POLISHED_GRANITE), "xx", "xx", 'x', "stoneGranite");
        }
        if (UpdatedBlocks.enablePrismarine) {
            int PLAIN = 0;
            int BRICKS = 1;
            int DARK = 2;

            addShapedRecipe(new ItemStack(ModBlocks.prismarineBlock, 1, DARK), "xxx", "xyx", "xxx", 'x', "shardPrismarine", 'y', "dyeBlack");
            addShapedRecipe(new ItemStack(ModBlocks.prismarineBlock, 1, PLAIN), "xx", "xx", 'x', "shardPrismarine");
            addShapedRecipe(new ItemStack(ModBlocks.prismarineBlock, 1, BRICKS), "xxx", "xxx", "xxx", 'x', "shardPrismarine");
            addShapedRecipe(new ItemStack(ModBlocks.prismarineBlock), "xyx", "yyy", "xyx", 'x', "shardPrismarine", 'y', "crystalPrismarine");

            if (UpdatedBlocks.enableRecipeForPrismarine && !Loader.isModLoaded("Botania")) {
                addShapedRecipe(new ItemStack(ModItems.prismarineShard, 4), "xy", "zx", 'x', "gemQuartz", 'y', "dyeBlue", 'z', "dyeGreen");
                addShapedRecipe(new ItemStack(ModItems.prismarineCrystals, 4), "xy", "yx", 'x', "gemQuartz", 'y', "dustGlowstone");
            }
        }
    }

    private static void addShapedRecipe(ItemStack output, Object... objects) {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, objects));
    }

    private static void addShapelessRecipe(ItemStack output, Object... objects) {
        GameRegistry.addRecipe(new ShapelessOreRecipe(output, objects));
    }
}
