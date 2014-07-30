package com.greatorator.ddtc.init;

import com.greatorator.ddtc.block.BlockDDTC;
import com.greatorator.ddtc.block.BlockHeart;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockDDTC heart = new BlockHeart();

    public static void init()
    {
        GameRegistry.registerBlock(heart, "heart");
    }
}
