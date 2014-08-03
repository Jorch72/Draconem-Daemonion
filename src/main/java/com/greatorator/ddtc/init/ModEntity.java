package com.greatorator.ddtc.init;

import com.greatorator.ddtc.mobs.EntityBear;
import com.greatorator.ddtc.mobs.EntityDDTC;
import com.greatorator.ddtc.mobs.EntityDraconem;

public class ModEntity
{
    public static void init()
    {
        EntityDDTC.registerEntityWithEgg(EntityDraconem.class, "Raphael");
        EntityDDTC.registerEntityWithEgg(EntityBear.class, "Leonardo");
    }
}