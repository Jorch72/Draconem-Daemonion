package com.greatorator.ddtc.proxy;

import com.greatorator.ddtc.mobs.EntityBear;
import com.greatorator.ddtc.mobs.models.ModelBear;
import com.greatorator.ddtc.mobs.renders.RenderBear;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy
{
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.3F));
    }
}
