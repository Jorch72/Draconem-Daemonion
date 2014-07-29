package com.greatorator.ddtc.init;

import com.greatorator.ddtc.item.ItemDDTC;
import com.greatorator.ddtc.item.ItemDragonFlower;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemDDTC dragonFlower = new ItemDragonFlower();

    public static void init()
    {
        GameRegistry.registerItem(dragonFlower, "dragonFlower");
    }
}
