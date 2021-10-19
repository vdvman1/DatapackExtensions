package com.vdv.datapackextensions.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class DatapackExtensionsClient implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("datapack-extensions");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello Fabric world from the client!");
    }
}
