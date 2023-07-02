package io.github.consistencyplus.obsidianslabs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.block.piston.PistonBehavior.BLOCK;


public class ObsidianSlabs implements ModInitializer {
    public static final Identifier namespace = new Identifier("obsidian_slab", "obsidian_slab");

    public static final Block OBSIDIAN_SLAB = Registry.register(Registries.BLOCK, namespace, new SlabBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
    public static final Item OBSIDIAN_SLAB_ITEM = Registry.register(Registries.ITEM, namespace, new BlockItem(OBSIDIAN_SLAB, new Item.Settings()));

    @Override
	public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register((fabricItemGroupEntries)-> {
            fabricItemGroupEntries.add(OBSIDIAN_SLAB);
        });

    }}
