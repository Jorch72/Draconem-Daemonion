package com.greatorator.ddtc.mobs.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderBear extends RenderLiving  {

    private static final ResourceLocation textureBear = new ResourceLocation("draconemdaemonion:textures/mobs/Bear.png");

    public RenderBear(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);

    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {

        return null;
    }

}