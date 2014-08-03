package com.greatorator.ddtc.item;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import java.util.Random;

public class OmeletMaker extends EntityThrowable
{
    protected String entityToSpawnName = "";
    protected EntityAnimal entityToSpawn;

    public OmeletMaker(World par1World)
    {
        super(par1World);
    }

    public OmeletMaker(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public void setEntityToSpawn(String parEntityToSpawnName)
    {
        entityToSpawnName = parEntityToSpawnName;
    }

    public String getEntityToSpawn()
    {
        return entityToSpawnName;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (par1MovingObjectPosition.entityHit != null)
        {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.0F);
        }

        if (!worldObj.isRemote) // never spawn entity on client side
        {
            entityToSpawn = (EntityAnimal) EntityList.createEntityByName(entityToSpawnName, worldObj);
            entityToSpawn.setGrowingAge(1000);
            entityToSpawn.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
            worldObj.spawnEntityInWorld(entityToSpawn);
        }

        for (int j = 0; j < 8; ++j)
        {
            worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ,
                    0.0D, 0.0D, 0.0D);
        }

        if (!worldObj.isRemote)
        {
            setDead();
        }
    }
}