package org.russia9.updatedblocks.common.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
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
        GameRegistry.addRecipe(new ItemStack(ModBlocks.bone), "AAA", "AAA", "AAA", 'A', new ItemStack(Items.dye,1,15));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mossy_cobblestone), Blocks.cobblestone, Blocks.vine);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.leather), ModItems.rabbitHide, ModItems.rabbitHide, ModItems.rabbitHide, ModItems.rabbitHide);
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.stone, 4,5), new ItemStack(ModBlocks.stone,1,4),new ItemStack(ModBlocks.stone,1,4),new ItemStack(ModBlocks.stone,1,4),new ItemStack(ModBlocks.stone,1,4));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.stone, 4,3), new ItemStack(ModBlocks.stone,1,2),new ItemStack(ModBlocks.stone,1,2),new ItemStack(ModBlocks.stone,1,2),new ItemStack(ModBlocks.stone,1,2));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.stone, 4,1), new ItemStack(ModBlocks.stone,1,0),new ItemStack(ModBlocks.stone,1,0),new ItemStack(ModBlocks.stone,1,0),new ItemStack(ModBlocks.stone,1,0));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye,9,15), ModBlocks.bone);
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick,1,1), Blocks.stonebrick, Blocks.vine);
    }
}
