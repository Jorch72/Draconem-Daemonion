package com.greatorator.ddtc.proxy;

import com.greatorator.ddtc.mobs.EntityDonatello;
import com.greatorator.ddtc.mobs.EntityLeonardo;
import com.greatorator.ddtc.mobs.EntityMichaelangelo;
import com.greatorator.ddtc.mobs.EntityRaphael;
import com.greatorator.ddtc.mobs.renders.RenderDonatello;
import com.greatorator.ddtc.mobs.renders.RenderLeonardo;
import com.greatorator.ddtc.mobs.renders.RenderMichaelangelo;
import com.greatorator.ddtc.mobs.renders.RenderRaphael;
import com.greatorator.ddtc.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends ServerProxy
{
    @Override
    public void registerRenderThings()
    {
		LogHelper.info("Raph: Let's kick some ass...");
        RenderingRegistry.registerEntityRenderingHandler(EntityRaphael.class, new RenderRaphael(new ModelBiped(), 0));
        LogHelper.info("Leo: I wanna join the party too...");
        RenderingRegistry.registerEntityRenderingHandler(EntityLeonardo.class, new RenderLeonardo(new ModelBiped(), 0));
        LogHelper.info("Mikey: Can we get some pizza?");
        RenderingRegistry.registerEntityRenderingHandler(EntityMichaelangelo.class, new RenderMichaelangelo(new ModelBiped(), 0));
        LogHelper.info("Donny: Totally awesome dudes!");
        RenderingRegistry.registerEntityRenderingHandler(EntityDonatello.class, new RenderDonatello(new ModelBiped(), 0));
    }
}
