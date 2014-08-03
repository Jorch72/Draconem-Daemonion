package com.greatorator.ddtc.item;

import com.greatorator.ddtc.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemDragonFlower extends ItemDDTC
{
    public ItemDragonFlower()
    {
        super();
        this.setUnlocalizedName("dragonFlower");
		ModItems.register(this);
    }
}
