package org.russia9.updatedblocks.common.item.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.russia9.updatedblocks.updatedBlocks;

public class ItemModFood extends ItemFood {
    private PotionEffect[] potionEffects;

    public ItemModFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavourite, PotionEffect... potionEffects) {
        super(healAmount, saturationModifier, wolvesFavourite);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(updatedBlocks.MODID + ":" + unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabFood);
        this.potionEffects = potionEffects;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        super.onFoodEaten(stack, world, player);
        for (PotionEffect potionEffect : potionEffects) {
            if (!world.isRemote && potionEffect != null && potionEffect.getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(potionEffect.getPotionID(), potionEffect.getDuration(), potionEffect.getAmplifier(), potionEffect.getIsAmbient()));
        }
    }
}
