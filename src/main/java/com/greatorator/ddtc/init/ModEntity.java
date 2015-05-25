package com.greatorator.ddtc.init;

import com.greatorator.ddtc.DraconemDaemonion;
import com.greatorator.ddtc.mobs.EntityDonatello;
import com.greatorator.ddtc.mobs.EntityLeonardo;
import com.greatorator.ddtc.mobs.EntityMichaelangelo;
import com.greatorator.ddtc.mobs.EntityRaphael;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ModEntity
{
	public static final int EntityRaphaelId = 0; //This number is unique to your mod so it can start at 0 and increase 1 for each mob
    public static final int EntityLeonardoId = 1;
    public static final int EntityMichaelangeloId = 2;
    public static final int EntityDonatelloId = 3;

    public static void init()
    {
		registerEntities();
    }

	public static void registerEntities()
	{
		EntityRegistry.registerModEntity(EntityRaphael.class, "Raphael", EntityRaphaelId, DraconemDaemonion.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityLeonardo.class, "Leonardo", EntityLeonardoId, DraconemDaemonion.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityMichaelangelo.class, "Michaelangelo", EntityMichaelangeloId, DraconemDaemonion.instance, 80, 3, false);
        EntityRegistry.registerModEntity(EntityDonatello.class, "Donatello", EntityDonatelloId, DraconemDaemonion.instance, 80, 3, false);
	}

	//Moved registerSpawnEgg to the ModItems
}