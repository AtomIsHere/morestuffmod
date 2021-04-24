package com.github.atomishere.morestuffmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreBlocks {

    public static final Block MUD = new Block(FabricBlockSettings.of(Material.SOIL).strength(0.5F).sounds(BlockSoundGroup.GRAVEL));
    public static final Block LEAF_LITTER = new Block(FabricBlockSettings.of(Material.LEAVES).strength(0.2F).sounds(BlockSoundGroup.GRASS));

    public static void register() {
        registerBlockAndItem(MUD, "mud", ItemGroup.BUILDING_BLOCKS);
        registerBlockAndItem(LEAF_LITTER, "leaf_litter", ItemGroup.DECORATIONS);
    }

    private static void registerBlockAndItem(Block block, String id, ItemGroup itemGroup) {
        Identifier identifier = new Identifier("morestuffmod", id);

        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }
}
