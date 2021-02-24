package net.consistencyteam.consistency_plus;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.piston.PistonBehavior.BLOCK;

public class Blocks {

    //Obsidian
        public static final Block OBSIDIAN_SLAB = register("obsidian_slab", new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));

        private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("obsidian_slab", name), block);
    }
        public static void init() {}
}
