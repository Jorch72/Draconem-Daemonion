package com.greatorator.ddtc.item;

import com.greatorator.ddtc.creativetab.CreativeTabDDTC;
import com.greatorator.ddtc.mobs.EntityDraconem;
import net.minecraft.entity.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemDragonFlower extends ItemDDTC
{
    public ItemDragonFlower()
    {
        super();
        this.setUnlocalizedName("dragonFlower");
    }

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float p_77648_8_, float p_77648_9_, float p_77648_10_) {
		EntityLiving entity = new EntityDraconem(world);
		double sX = x + ForgeDirection.getOrientation(side).offsetX + 0.5;
		double sY = y + ForgeDirection.getOrientation(side).offsetY + 0.5;
		double sZ = z + ForgeDirection.getOrientation(side).offsetZ + 0.5;
		entity.setLocationAndAngles(sX, sY, sZ, player.rotationYaw, 0F);

		if (!world.isRemote) {
			entity.onSpawnWithEgg(null);
			world.spawnEntityInWorld(entity);
			if (!player.capabilities.isCreativeMode)
			{
				stack.stackSize--;
			}
		}
		return true;
	}
}
