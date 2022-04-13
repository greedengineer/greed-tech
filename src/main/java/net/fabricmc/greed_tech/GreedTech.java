package net.fabricmc.greed_tech;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.greed_tech.blocks.GRTBlocks;
import net.fabricmc.greed_tech.common.GRTProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreedTech implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(GRTProperties.MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("GreedTech initialize");
		GRTBlocks.registerBlocks();
	}
}
