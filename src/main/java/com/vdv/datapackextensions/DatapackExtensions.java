package com.vdv.datapackextensions;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatapackExtensions implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("datapack-extensions");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}
