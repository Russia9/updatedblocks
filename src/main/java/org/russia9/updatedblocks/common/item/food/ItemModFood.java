package org.russia9.updatedblocks.common.item.food;

import javafx.scene.effect.Effect;
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
        for (int i = 0; i < potionEffects.length; i++) {
            if (!world.isRemote && potionEffects[i] != null && potionEffects[i].getPotionID() > 0)
                player.addPotionEffect(new PotionEffect(this.potionEffects[i].getPotionID(), this.potionEffects[i].getDuration(), this.potionEffects[i].getAmplifier(), this.potionEffects[i].getIsAmbient()));
        }
    }
}
