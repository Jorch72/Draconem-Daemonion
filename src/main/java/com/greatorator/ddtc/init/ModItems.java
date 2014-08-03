package com.greatorator.ddtc.init;

import com.greatorator.ddtc.item.EggChucker;
import com.greatorator.ddtc.item.ItemDDTC;
import com.greatorator.ddtc.item.ItemDragonFlower;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;

import java.util.Random;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static ItemDDTC dragonFlower;
	public static ItemDDTC eggChucker;

    public static void init()
    {
		dragonFlower = new ItemDragonFlower(); //I like to register items and blocks in the constructor of the item or block class. If you dont like this go ahead and change it back to how you like it
		eggChucker = new EggChucker();
    }

	public static void register(ItemDDTC item)
	{
		GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
	}
}


