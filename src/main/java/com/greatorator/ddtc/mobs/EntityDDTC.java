package com.greatorator.ddtc.mobs;

import com.greatorator.ddtc.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.item.Item;

import java.util.Random;

public class EntityDDTC extends Item
{
    public static void init()
    {
    registerEntity();
    }
    public static void registerEntity()
    {
        createEntity(EntityDraconem.class, "Draconem");
    }

    public static void createEntity(Class entityClass, String entityName)
    {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        long seed = entityName.hashCode();
        Random rand = new Random(seed);
        int solidColor = rand.nextInt() * 16777215;
        int spotColor = rand.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, Reference.MOD_ID, 32, 1, true);
        createEgg(randomId, solidColor, spotColor);
    }
    private static void createEgg(int randomId, int solidColor, int spotColor)
    {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
