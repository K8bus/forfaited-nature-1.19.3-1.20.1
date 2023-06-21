package as.forfeitednaturemod;

import as.forfeitednaturemod.item.ModItemGroup;
import as.forfeitednaturemod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForfeitedNatureMod implements ModInitializer {
	public static final String MOD_ID = "forfeitednaturemod";
    public static final Logger LOGGER = LoggerFactory.getLogger("FNMod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}