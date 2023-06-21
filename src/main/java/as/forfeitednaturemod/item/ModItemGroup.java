package as.forfeitednaturemod.item;

import as.forfeitednaturemod.ForfeitedNatureMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup RESOURCES;

    public static void registerItemGroups() {
        RESOURCES = FabricItemGroup.builder(new Identifier(ForfeitedNatureMod.MOD_ID, "resources"))
                .displayName(Text.literal("FN Resources"))
                .icon(() -> new ItemStack(ModItems.AMBER_CHUNK)).build();

    }
}


