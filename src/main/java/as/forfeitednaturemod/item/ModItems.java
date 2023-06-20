package as.forfeitednaturemod.item;

import as.forfeitednaturemod.ForfeitedNatureMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AMBER_CHUNK = registerItem("amber_chunk",
            new Item(new Item.Settings()));
    public static final Item LUMINESCENT_CRYSTAL = registerItem("luminescent_crystal",
            new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ForfeitedNatureMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, AMBER_CHUNK);
        addToItemGroup(ItemGroups.INGREDIENTS, LUMINESCENT_CRYSTAL);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems() {
        ForfeitedNatureMod.LOGGER.info("Registering Mod Items for " + ForfeitedNatureMod.MOD_ID);

        addItemsToItemGroup();
    }


}
