package com.greatorator.ddtc.init;

import com.greatorator.ddtc.plants.FlowerDragon;
import com.greatorator.ddtc.plants.PlantsDDTC;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModPlants
{
    public static final PlantsDDTC dragonFlower = new FlowerDragon();

    public static void init()
    {
        GameRegistry.registerBlock(dragonFlower, "dragonFlower");
    }
}