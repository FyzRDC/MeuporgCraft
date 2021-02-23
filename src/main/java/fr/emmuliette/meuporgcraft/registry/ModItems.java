package fr.emmuliette.meuporgcraft.registry;

import fr.emmuliette.meuporgcraft.MeuporgCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final Item UwU = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(MeuporgCraft.MOD_ID,  "uwu"), UwU);
	}
	
}
