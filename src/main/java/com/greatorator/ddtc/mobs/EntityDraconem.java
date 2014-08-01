package com.greatorator.ddtc.mobs;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityDraconem extends EntityAnimal
{
    public EntityDraconem(World par1World)
    {
        super(par1World);
        this.setSize(0.9F, 1.9F);
        this.tasks.addTask(0, new EntityAIWander(this, 0.3D));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.2D));
        this.tasks.addTask(2, new EntityAILookIdle(this));
        this.tasks.addTask(3, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAITempt(this, 0.4D, Items.book, false));
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1)
    {
        return new EntityDraconem(worldObj);
    }
}