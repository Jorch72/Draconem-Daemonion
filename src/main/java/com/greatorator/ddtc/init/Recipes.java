package com.greatorator.ddtc.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(ModPlants.dragonFlower), " s ", "sss", " s ", 's', new ItemStack(Items.blaze_powder));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_powder), new ItemStack(ModPlants.dragonFlower));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.heart), new ItemStack(ModPlants.dragonFlower), new ItemStack(ModPlants.dragonFlower));
    }
}
