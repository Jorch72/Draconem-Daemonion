package com.greatorator.ddtc.init;

import com.greatorator.ddtc.item.EggChucker;
import com.greatorator.ddtc.item.ItemDDTC;
import com.greatorator.ddtc.item.ItemDragonFlower;
import com.greatorator.ddtc.reference.Reference;
import com.greatorator.ddtc.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;

import java.util.Random;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static ItemDDTC dragonFlower = new ItemDragonFlower();
	public static ItemDDTC eggChucker = new EggChucker();

    public static void init()
    {
		GameRegistry.registerItem(dragonFlower, "dragonFlower");
		GameRegistry.registerItem(eggChucker, "eggChucker");
    }
}


