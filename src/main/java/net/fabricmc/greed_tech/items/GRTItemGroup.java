package net.fabricmc.greed_tech.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.greed_tech.common.GRTProperties;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class GRTItemGroup {
    //TODO アイコン用アイテム考える
    //TODO アイテムの登録をGRTBlockRegistryと同じ感じでやると相互依存になっちゃうのが気になる
    public static final ItemGroup GENERAL = FabricItemGroupBuilder
            .build(new Identifier(GRTProperties.MOD_ID, "general"), () -> new ItemStack(Blocks.COBBLESTONE));
}
