
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dreams.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.dreams.item.ClozyTestItemItem;
import net.mcreator.dreams.item.BoredTestItemItem;
import net.mcreator.dreams.DreamsMod;

public class DreamsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DreamsMod.MODID);
	public static final RegistryObject<Item> BORED_TEST_ITEM = REGISTRY.register("bored_test_item", () -> new BoredTestItemItem());
	public static final RegistryObject<Item> CLOZY_TEST_ITEM = REGISTRY.register("clozy_test_item", () -> new ClozyTestItemItem());
}
