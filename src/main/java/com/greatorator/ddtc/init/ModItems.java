package com.greatorator.ddtc.init;

import com.greatorator.ddtc.item.ItemDDTC;
import com.greatorator.ddtc.item.ItemDragonFlower;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemDDTC dragonFlower = new ItemDragonFlower();

    public static void init()
    {
        GameRegistry.registerItem(dragonFlower, "dragonFlower");
    }
}
