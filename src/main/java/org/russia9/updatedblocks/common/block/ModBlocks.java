package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import org.russia9.updatedblocks.IConfigurable;

import java.lang.reflect.Field;

public final class ModBlocks {
    public static final Block stone = new Stone();
    public static final Block prismarineBlock = new PrismarineBlock();
    public static final Block purpurBlock = new PurpurBlock();
    public static final Block purpurSlab = new PurpurSlab();
    public static final Block purpurStairs = new PurpurStairs();
    public static final Block redSandstone = new RedSandstone();
    public static final Block redSandstoneSlab = new RedSandstoneSlab();
    public static final Block redSandstoneStairs = new RedSandstoneStairs();
    public static final Block boneBlock = new Bone();
    public static final Block purpurPillar = new PurpurPillar();
    public static final Block seaLantern = new SeaLantern();
    public static final Block slimeBlock = new SlimeBlock();

    public static void init() {
        try {
            for (Field f : ModBlocks.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Block)
                    registerBlock((Block) obj);
                else if (obj instanceof Block[])
                    for (Block block : (Block[]) obj)
                        if (block != null)
                            registerBlock(block);
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void registerBlock(Block block) {
        if (!(block instanceof IConfigurable) || ((IConfigurable) block).isEnabled()) {
            String name = block.getUnlocalizedName();
            String[] strings = name.split("\\.");

            if (block instanceof ISubBlocksBlock)
                GameRegistry.registerBlock(block, ((ISubBlocksBlock) block).getItemBlockClass(), strings[strings.length - 1]);
            else
                GameRegistry.registerBlock(block, strings[strings.length - 1]);

            if (block instanceof IBurnableBlock)
                Blocks.fire.setFireInfo(block, 5, 20);
        }
    }

    public static interface ISubBlocksBlock {

        Class<? extends ItemBlock> getItemBlockClass();
    }

    public static interface IBurnableBlock {
    }
}
