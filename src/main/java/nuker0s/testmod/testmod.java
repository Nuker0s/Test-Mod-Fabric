package nuker0s.testmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import nuker0s.testmod.item.AddItemGroup;
import nuker0s.testmod.item.Moaiitem;
import nuker0s.testmod.item.ModItems;
import nuker0s.testmod.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testmod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "testmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("testmod");
	public static Item[] itemlist = {Moaiitem.MOAI};


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModSounds.init();
		AddItemGroup.registerIG();
		for (Item item:itemlist) {
			ModItems.reglogitems(item);
		}


	}
}