package net.consistencyteam.consistency_plus;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {
    public static final Item OBSIDIAN_SLAB = register("obsidian_slab", new BlockItem(Blocks.OBSIDIAN_SLAB, new Item.Settings().group(ItemGroup.REDSTONE)));


    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("obsidian_slab", name), item);
    }
    public static void init() {
    }
}