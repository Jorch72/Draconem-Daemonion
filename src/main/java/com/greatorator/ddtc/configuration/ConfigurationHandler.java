package com.greatorator.ddtc.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile) {
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Does anyone even see this?").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
    }

    }
}
