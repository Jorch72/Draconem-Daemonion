package com.greatorator.ddtc.mobs;

import com.greatorator.ddtc.item.EggChucker;
import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.Random;

public class EntityDDTC extends Item
{

    public static void registerEntityWithEgg(Class entityClass, String entityName)
    {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        long seed = entityName.hashCode();
        Random rand = new Random(seed);
        int solidColor = rand.nextInt() * 16777215;
        int spotColor = rand.nextInt() * 16777215;

        EntityRegistry.registerModEntity(entityClass, entityName, randomId, Reference.MOD_ID, 80, 3, false);
        registerSpawnEgg(entityName, solidColor, spotColor);
    }

    // can't use vanilla spawn eggs with entities registered with modEntityID, so use
// custom eggs. Name passed must match entity name string
    public static void registerSpawnEgg(String entityName, int solidColor, int spotColor)
    {
        Item itemSpawnEgg = new EggChucker(entityName, solidColor, spotColor).setUnlocalizedName("spawn_egg_"+entityName.toLowerCase()).setTextureName(Reference.MOD_ID + ":spawn_egg");
        GameRegistry.registerItem(itemSpawnEgg, "spawnEgg"+entityName);
    }
}
