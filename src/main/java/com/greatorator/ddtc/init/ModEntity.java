package com.greatorator.ddtc.init;

import com.greatorator.ddtc.DraconemDaemonion;
import com.greatorator.ddtc.mobs.EntityBear;
import com.greatorator.ddtc.mobs.EntityDraconem;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntity
{
	public static final int EntityDraconemId = 0; //This number is unique to your mod so it can start at 0 and increase 1 for each mob
	public static final int EntityBearId = 1;

    public static void init()
    {
		registerEntityes();
    }

	public static void registerEntityes()
	{
		EntityRegistry.registerModEntity(EntityDraconem.class, "Draconem", EntityDraconemId, DraconemDaemonion.instance, 80, 3, false);
		EntityRegistry.registerModEntity(EntityBear.class, "Bear", EntityBearId, DraconemDaemonion.instance, 80, 3, false);
	}

	//Moved registerSpawnEgg to the ModItems
}