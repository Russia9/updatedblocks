package org.russia9.updatedblocks.common.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import org.russia9.updatedblocks.common.block.ModBlocks;
import org.russia9.updatedblocks.common.item.ModItems;

public class Crafting {
    public static final void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.stewRabbit), "GAG", "DBE", "GCG", 'A', ModItems.cookedRabbit, 'B', Items.baked_potato, 'C', Items.bowl, 'D', Items.carrot, 'E', Blocks.brown_mushroom, 'F', Blocks.red_mushroom);
        GameRegistry.addRecipe(new ItemStack(ModItems.stewRabbit), "GAG", "DBF", "GCG", 'A', ModItems.cookedRabbit, 'B', Items.baked_potato, 'C', Items.bowl, 'D', Items.carrot, 'E', Blocks.brown_mushroom, 'F', Blocks.red_mushroom);
        GameRegistry.addRecipe(new ItemStack(ModItems.stewRabbit), "GAG", "EBD", "GCG", 'A', ModItems.cookedRabbit, 'B', Items.baked_potato, 'C', Items.bowl, 'D', Items.carrot, 'E', Blocks.brown_mushroom, 'F', Blocks.red_mushroom);
        GameRegistry.addRecipe(new ItemStack(ModItems.stewRabbit), "GAG", "FBD", "GCG", 'A', ModItems.cookedRabbit, 'B', Items.baked_potato, 'C', Items.bowl, 'D', Items.carrot, 'E', Blocks.brown_mushroom, 'F', Blocks.red_mushroom);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), Blocks.cobblestone, Blocks.vine);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), ModItems.rabbitHide, ModItems.rabbitHide, ModItems.rabbitHide, ModItems.rabbitHide);
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.andesiteSmooth, 4), ModBlocks.andesite, ModBlocks.andesite, ModBlocks.andesite, ModBlocks.andesite);
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.graniteSmooth, 4), ModBlocks.granite, ModBlocks.granite, ModBlocks.granite, ModBlocks.granite);
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.dioriteSmooth, 4), ModBlocks.diorite, ModBlocks.diorite, ModBlocks.diorite, ModBlocks.diorite);
    }
}
