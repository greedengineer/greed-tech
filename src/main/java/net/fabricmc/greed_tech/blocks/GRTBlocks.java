package net.fabricmc.greed_tech.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.greed_tech.GRTRegistry;
import net.fabricmc.greed_tech.items.GRTItemGroup;
import net.minecraft.block.Material;
import net.minecraft.item.Item;

public final class GRTBlocks {
    public static GRTBlock MACHINE_BLOCK = new GRTBlock("machine_block", FabricBlockSettings.of(Material.METAL));

    public static void registerBlocks() {
        GRTRegistry.registerBlock(MACHINE_BLOCK, new Item.Settings().group(GRTItemGroup.GENERAL));
    }
}
