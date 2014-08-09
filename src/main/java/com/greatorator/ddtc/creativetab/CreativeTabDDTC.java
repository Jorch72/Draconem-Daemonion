package com.greatorator.ddtc.creativetab;

import com.greatorator.ddtc.init.ModItems;
import com.greatorator.ddtc.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabDDTC
{
    public static final CreativeTabs DDTC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.itemCreativeTab;
        }
    };
}
