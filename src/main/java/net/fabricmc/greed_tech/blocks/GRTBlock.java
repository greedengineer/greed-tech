package net.fabricmc.greed_tech.blocks;

import net.fabricmc.greed_tech.common.GRTProperties;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GRTBlock extends Block {
    private final String registerName;

    public GRTBlock(String name, Settings settings) {
        super(settings);
        this.registerName=name;
    }

    public String getRegisterName() {
        return registerName;
    }
}
