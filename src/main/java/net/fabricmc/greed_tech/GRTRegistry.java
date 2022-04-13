package net.fabricmc.greed_tech;

import net.fabricmc.greed_tech.blocks.GRTBlock;
import net.fabricmc.greed_tech.common.GRTProperties;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GRTRegistry {
    public static void registerBlock(GRTBlock block) {
        Registry.register(Registry.BLOCK, new Identifier(GRTProperties.MOD_ID, block.getRegisterName()), block);
    }

    public static void registerBlock(GRTBlock block, Item.Settings blockItemSettings) {
        registerBlock(block);
        var blockItem = new BlockItem(block, blockItemSettings);
        Registry.register(Registry.ITEM, new Identifier(GRTProperties.MOD_ID, block.getRegisterName()), blockItem);
    }
}
