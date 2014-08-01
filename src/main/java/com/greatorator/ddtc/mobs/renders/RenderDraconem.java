package com.greatorator.ddtc.mobs.renders;

import com.greatorator.ddtc.mobs.EntityDraconem;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderDraconem extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MOD_ID + ":textures/mobs/draconem.png");
    private static final String __OBFID = "CL_00000984";

    public RenderDraconem(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityDraconem par1EntityCow)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityDraconem)par1Entity);
    }
}