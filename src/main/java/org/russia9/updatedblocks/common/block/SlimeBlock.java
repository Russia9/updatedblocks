package org.russia9.updatedblocks.common.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import org.russia9.updatedblocks.IConfigurable;
import org.russia9.updatedblocks.UpdatedBlocks;
import org.russia9.updatedblocks.lib.ModSounds;
import org.russia9.updatedblocks.lib.RenderIDs;
import org.russia9.updatedblocks.lib.Utils;

public class SlimeBlock extends Block implements IConfigurable {
    protected SlimeBlock() {
        super(Material.clay);
        setHardness(0.0F);
        setBlockTextureName(UpdatedBlocks.MODID + ":" + "slime");
        setStepSound(ModSounds.soundSlime);
        setBlockName(Utils.getUnlocalisedName("slime"));
        setCreativeTab(UpdatedBlocks.enableSlimeBlock ? CreativeTabs.tabBlock : null);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        float f = 0.125F;
        return AxisAlignedBB.getBoundingBox(x, y, z, x + 1, y + 1 - f, z + 1);
    }

    @Override
    public void onFallenUpon(World world, int x, int y, int z, Entity entity, float fallDistance) {
        if (!entity.isSneaking()) {
            entity.fallDistance = 0;
            if (entity.motionY < 0)
                entity.getEntityData().setDouble(UpdatedBlocks.MODID + ":slime", -entity.motionY);
        }
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        NBTTagCompound data = entity.getEntityData();
        if (data.hasKey(UpdatedBlocks.MODID + ":slime")) {
            entity.motionY = data.getDouble(UpdatedBlocks.MODID + ":slime");
            data.removeTag(UpdatedBlocks.MODID + ":slime");
        }

        if (Math.abs(entity.motionY) < 0.1 && !entity.isSneaking()) {
            double d = 0.4 + Math.abs(entity.motionY) * 0.2;
            entity.motionX *= d;
            entity.motionZ *= d;
        }
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass() {
        return 1;
    }

    @Override
    public int getRenderType() {
        return RenderIDs.SLIME_BLOCK;
    }

    @Override
    public boolean isEnabled() {
        return UpdatedBlocks.enableSlimeBlock;
    }
}
