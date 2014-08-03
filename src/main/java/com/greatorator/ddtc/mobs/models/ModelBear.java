package com.greatorator.ddtc.mobs.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly (Side.CLIENT)
public class ModelBear extends ModelBase {
	ModelRenderer head;
    ModelRenderer nose;
    ModelRenderer body;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
  
  public ModelBear()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    super.textureHeight = textureHeight;
    super.textureWidth = textureWidth;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -4F, -6F, 9, 9, 8);
      head.setTextureOffset(21, 20).addBox(-2F, 1F, -9F, 5, 4, 5); //nose
      head.setRotationPoint(-1F, 4F, -8F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);

      body = new ModelRenderer(this, 50, 0);
      body.addBox(-8F, -10F, -9F, 15, 18, 13);
      body.setRotationPoint(0F, 5F, 2F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 1.570796F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 20);
      leg1.addBox(-3F, 0F, -2F, 4, 10, 4);
      leg1.setRotationPoint(-3F, 14F, 7F);
      leg1.setTextureSize(128, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 20);
      leg2.addBox(-1F, 0F, -2F, 4, 10, 4);
      leg2.setRotationPoint(3F, 14F, 7F);
      leg2.setTextureSize(128, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 20);
      leg3.addBox(-3F, 0F, -3F, 4, 10, 4);
      leg3.setRotationPoint(-3F, 14F, -5F);
      leg3.setTextureSize(128, 64);
      leg3.mirror = true;
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 20);
      leg4.addBox(-1F, 1F, -3F, 4, 10, 4);
      leg4.setRotationPoint(3F, 13F, -5F);
      leg4.setTextureSize(128, 64);
      leg4.mirror = true;
      setRotation(leg4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    if (this.isChild)
    {
        float f6 = 2.0F;
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
        this.head.renderWithRotation(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
        GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
        this.body.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
        GL11.glPopMatrix();
    }
    else
    {
    	this.head.renderWithRotation(f5);
    	this.body.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
    }
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7)
  {
	  float f6 = (180F / (float)Math.PI);
      this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
      this.head.rotateAngleY = par4 / (180F / (float)Math.PI);
      this.body.rotateAngleX = ((float)Math.PI / 2F);
      this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
  }

}