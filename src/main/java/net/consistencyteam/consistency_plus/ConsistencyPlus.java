package net.consistencyteam.consistency_plus;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ConsistencyPlus implements ModInitializer {
    @Override
	public void onInitialize() {
        System.out.println("Obsidian Slab - Based on Consistency+ - Starting Initialization");
        System.out.println("Obsidian Slab - Based on Consistency+ - Beginning Block Initialization");
        Blocks.init();
        System.out.println("Obsidian Slab - Based on Consistency+ - Blocks Initialized");
        System.out.println("Obsidian Slab - Based on Consistency+ - Beginning Item Initialization");
        Items.init();
        System.out.println("Obsidian Slab - Based on Consistency+ - Items Initialized");
        System.out.println("Obsidian Slab - Based on Consistency+ - Finished Initialization");
    }
}
