package org.russia9.updatedblocks.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import org.russia9.updatedblocks.common.item.food.ItemModFood;

public final class ModItems {
    public static Item rawMutton, cookedMutton, rawRabbit, cookedRabbit, stewRabbit, beetroot, beetrootSoup;
    public static Item rabbitHide;

    public static final void init() {
        //1.8
        GameRegistry.registerItem(rawMutton = new ItemModFood("mutton_raw", 2, 1.2F, false), "mutton");
        GameRegistry.registerItem(cookedMutton = new ItemModFood("mutton_cooked", 6, 9.6F, false), "cooked_mutton");
        GameRegistry.registerItem(rawRabbit = new ItemModFood("rabbit_raw", 3, 1.8F, false), "rabbit");
        GameRegistry.registerItem(cookedRabbit = new ItemModFood("rabbit_cooked", 5, 6F, false), "cooked_rabbit");
        GameRegistry.registerItem(stewRabbit = new ItemModFood("rabbit_stew", 10, 12F, false), "rabbit_stew");
        GameRegistry.registerItem(beetroot = new ItemModFood("beetroot", 1, 1.2F, false), "beetroot");
        GameRegistry.registerItem(beetrootSoup = new ItemModFood("beetroot_soup", 6, 7.2F, false), "beetroot_soup");
        GameRegistry.registerItem(rabbitHide = new ItemRabbitHide("rabbit_hide"), "rabbit_hide");
    }
}
