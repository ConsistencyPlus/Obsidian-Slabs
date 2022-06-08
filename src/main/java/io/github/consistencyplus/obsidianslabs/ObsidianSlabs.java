package io.github.consistencyplus.obsidianslabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.piston.PistonBehavior.BLOCK;


public class ObsidianSlabs implements ModInitializer {
    public static final Identifier namespace = new Identifier("obsidian_slab", "obsidian_slab");

    public static final Block OBSIDIAN_SLAB = Registry.register(Registry.BLOCK, namespace, new SlabBlock(AbstractBlock.Settings.of(new Material(MapColor.BLACK, false, true, true, true, false, false, BLOCK)).requiresTool().strength(50.0F, 1200.0F)));
    public static final Item OBSIDIAN_SLAB_ITEM = Registry.register(Registry.ITEM, namespace, new BlockItem(OBSIDIAN_SLAB, new Item.Settings().group(ItemGroup.REDSTONE)));

    @Override
	public void onInitialize() {}
}
