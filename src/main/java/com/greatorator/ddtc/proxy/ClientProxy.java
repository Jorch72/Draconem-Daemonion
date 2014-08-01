package com.greatorator.ddtc.proxy;

import com.greatorator.ddtc.mobs.EntityDraconem;
import com.greatorator.ddtc.mobs.renders.RenderDraconem;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends ServerProxy
{
    @Override
    public void registerRenderThings()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityDraconem.class, new RenderDraconem(new ModelBiped(), 0));
    }
}
