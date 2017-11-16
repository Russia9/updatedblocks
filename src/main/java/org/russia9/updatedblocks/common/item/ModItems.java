package org.russia9.updatedblocks.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import org.russia9.updatedblocks.IConfigurable;

import java.lang.reflect.Field;

public final class ModItems {
    public static final Item prismarineCrystals = new PrismarineCrystals();
    public static final Item prismarineCShard = new PrismarineShard();


    public static void init() {
        try {
            for (Field f : ModItems.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Item)
                    registerItem((Item) obj);
                else if (obj instanceof Item[])
                    for (Item item : (Item[]) obj)
                        registerItem(item);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void registerItem(Item item) {
        if (!(item instanceof IConfigurable) || ((IConfigurable) item).isEnabled()) {
            String name = item.getUnlocalizedName();
            String[] strings = name.split("\\.");
            GameRegistry.registerItem(item, strings[strings.length - 1]);
        }
    }
}
