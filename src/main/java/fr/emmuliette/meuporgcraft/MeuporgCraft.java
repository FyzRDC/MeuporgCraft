package fr.emmuliette.meuporgcraft;

import fr.emmuliette.meuporgcraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class MeuporgCraft implements ModInitializer{
	
	public static String MOD_ID = "meuporgcraft";

	@Override
	public void onInitialize() {
		System.out.println("A Meow Meow Organization Project.");
		ModItems.registerItems();
	}

}
