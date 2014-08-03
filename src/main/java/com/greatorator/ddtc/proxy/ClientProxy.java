package com.greatorator.ddtc.proxy;

import com.greatorator.ddtc.mobs.EntityBear;
import com.greatorator.ddtc.mobs.EntityDraconem;
import com.greatorator.ddtc.mobs.models.ModelBear;
import com.greatorator.ddtc.mobs.renders.RenderBear;
import com.greatorator.ddtc.mobs.renders.RenderDraconem;
import com.greatorator.ddtc.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends ServerProxy
{
    @Override
    public void registerRenderThings()
    {
		LogHelper.info("Populating world with vim and vigor!");
        RenderingRegistry.registerEntityRenderingHandler(EntityDraconem.class, new RenderDraconem(new ModelBiped(), 0));
        LogHelper.info("Joining the party too...");
        RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBiped(), 0));
    }
}
