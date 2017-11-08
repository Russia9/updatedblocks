package org.russia9.updatedblocks.common.recipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import org.russia9.updatedblocks.common.item.ModItems;

public class Smelting {
    public static final void init() {
        GameRegistry.addSmelting(ModItems.rawMutton,new ItemStack(ModItems.cookedMutton,1),1F);
        GameRegistry.addSmelting(ModItems.rawRabbit,new ItemStack(ModItems.cookedRabbit,1),1F);
    }
}
