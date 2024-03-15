
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superpowers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.superpowers.item.TestoItem;
import net.mcreator.superpowers.SuperpowersMod;

public class SuperpowersModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperpowersMod.MODID);
	public static final RegistryObject<Item> TESTO = REGISTRY.register("testo", () -> new TestoItem());
}
