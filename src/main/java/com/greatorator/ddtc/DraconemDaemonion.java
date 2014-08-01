package com.greatorator.ddtc;

import com.greatorator.ddtc.handler.ConfigurationHandler;
import com.greatorator.ddtc.init.ModBlocks;
import com.greatorator.ddtc.init.ModItems;
import com.greatorator.ddtc.mobs.EntityDDTC;
import com.greatorator.ddtc.proxy.ServerProxy;
import com.greatorator.ddtc.reference.Reference;
import com.greatorator.ddtc.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class DraconemDaemonion
{
    @Mod.Instance(Reference.MOD_ID)
    public static DraconemDaemonion instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static ServerProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Well now, let's get this party started!");

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();
        EntityDDTC.init();

        proxy.registerRenderThings();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }


}
