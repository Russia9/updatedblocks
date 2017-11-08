package org.russia9.updatedblocks.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.russia9.updatedblocks.updatedBlocks;

public class RenderEntity extends RenderBiped {
    private static ResourceLocation textureLocation;
    public RenderEntity(ModelBiped model, float shadowSize) {
        super(model, shadowSize);
        textureLocation = new ResourceLocation(updatedBlocks.MODID+":"+"textures/models/white.png");
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
        return textureLocation;
    }
}
