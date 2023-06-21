package as.forfeitednaturemod.block;

import as.forfeitednaturemod.ForfeitedNatureMod;
import as.forfeitednaturemod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST)
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)),
            ModItemGroup.RESOURCES);

    public static final Block RAW_AMBER_BLOCK = registerBlock("raw_amber_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST)
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CALCITE)),
            ModItemGroup.RESOURCES);


    public static final Block LUMINESCENT_CRYSTAL_BLOCK = registerBlock("luminescent_crystal_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST)
                    .emissiveLighting((state, world, pos) -> true)
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(8)),
            ModItemGroup.RESOURCES);

    public static final Block POLISHED_LUMINESCENT_CRYSTAL_BLOCK = registerBlock("polished_luminescent_crystal_block",
            new Block(FabricBlockSettings.of(Material.AMETHYST)
                    .emissiveLighting((state, world, pos) -> true)
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(14)),
            ModItemGroup.RESOURCES);

    public static final Block LUMINESCENT_CRYSTAL_BUD = registerBlock("luminescent_crystal_bud",
            new Block(FabricBlockSettings.of(Material.AMETHYST)
                    .emissiveLighting((state, world, pos) -> true)
                    .strength(1.5f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .luminance(8)),
            ModItemGroup.RESOURCES);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ForfeitedNatureMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ForfeitedNatureMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        ForfeitedNatureMod.LOGGER.info("Registering Mod Blocks for " + ForfeitedNatureMod.MOD_ID);

    }
}
