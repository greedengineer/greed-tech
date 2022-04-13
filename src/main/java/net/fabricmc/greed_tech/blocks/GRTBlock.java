package net.fabricmc.greed_tech.blocks;

import net.minecraft.block.Block;

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
