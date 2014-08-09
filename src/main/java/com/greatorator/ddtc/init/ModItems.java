package com.greatorator.ddtc.init;

import com.greatorator.ddtc.item.EggChucker;
import com.greatorator.ddtc.item.ItemCreativeTab;
import com.greatorator.ddtc.item.ItemDDTC;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
	public static ItemDDTC eggChucker = new EggChucker();
    public static final ItemDDTC itemCreativeTab = new ItemCreativeTab();

    public static void init()
    {
		GameRegistry.registerItem(eggChucker, "eggChucker");
        GameRegistry.registerItem(itemCreativeTab, "tabIcon");
    }
}


