package org.russia9.updatedblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "updatedblocks", name = "Updated Blocks")
public class UpdatedBlocks {
    @SidedProxy(clientSide = "org.russia9.updatedblocks.client.ClientProxy", serverSide = "org.russia9.updatedblocks.common.ServerProxy")
    public static CommonProxy proxy;

    public static final String MODID = "updatedblocks";
    public static final String ITEM_BLOCK_TEXTURE_PATH = MODID + ":";
    public static final String VERSION = "1.0 SNAPSHOT";

    public static final int maxStonesPerCluster = 32;

    public static boolean enableStones = true;
    public static boolean enableIronTrapdoor = true;
    public static boolean enableMutton = true;
    public static boolean enableSponge = true;
    public static boolean enablePrismarine = true;
    public static boolean enableDoors = true;
    public static boolean enableInvertedDaylightSensor = true;
    public static boolean enableCoarseDirt = true;
    public static boolean enableRedSandstone = true;
    public static boolean enableEnchants = true;
    public static boolean enableAnvil = true;
    public static boolean enableFences = true;
    public static boolean enableSilkTouchingMushrooms = true;
    public static boolean enableBanners = true;
    public static boolean enableSlimeBlock = true;
    public static boolean enableArmourStand = true;
    public static boolean enableRabbit = true;
    public static boolean enableOldGravel = true;
    public static boolean enableRecipeForPrismarine = true;
    public static boolean enableEndermite = true;
    public static boolean enableBeetroot = true;
    public static boolean enableChorusFruit = true;
    public static boolean enableGrassPath = true;
    public static boolean enableSticksFromDeadBushes = true;
    public static boolean enableBowRendering = true;
    public static boolean enableTippedArrows = true;
    public static boolean enableLingeringPotions = true;
    public static boolean enableBurnableBlocks = true;
    public static boolean enableFancySkulls = true;
    public static boolean enableSkullDrop = true;
    public static boolean enableDmgIndicator = true;
    public static boolean enableTransparentAmour = true;
    public static boolean enableCryingObsidian = true;
    public static boolean enableUpdatedFoodValues = true;
    public static boolean enableUpdatedHarvestLevels = true;
    public static boolean enableVillagerZombies = true;
    public static boolean enableStoneBrickRecipes = true;
    public static boolean enableBabyGrowthBoost = true;
    public static boolean enableVillagerTurnsIntoWitch = true;
    public static boolean enableElytra = true;
    public static boolean enableFrostWalker = true;
    public static boolean enableMending = true;
    public static boolean enableBrewingStands = true;
    public static boolean enableDragonRespawn = true;
    public static boolean enableRoses = true;
    public static boolean enableColourfulBeacons = true;
    public static boolean enablePlayerSkinOverlay = true;
    public static boolean enableShearableGolems = true;
    public static boolean enableShearableCobwebs = true;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        proxy.registerRenderers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
