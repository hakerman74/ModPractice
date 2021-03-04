package com.charles.tutorialmod.lists;

import com.charles.tutorialmod.main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemLists
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<Item>(ForgeRegistries.ITEMS, main.MOD_ID);
	
	public static final RegistryObject<Item> COPPER_MINERAL = ITEMS.register("copper_mineral", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> COPPER_FRAGMENT = ITEMS.register("copper_fragment", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> TUTORIAL_SLAB = ITEMS.register("tutorial_slab", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> TUTORIAL_STAIRS = ITEMS.register("tutorial_stairs", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> LIME_LINOLEUM = ITEMS.register("lime_linoleum", () -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	
	


}
