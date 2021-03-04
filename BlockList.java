package com.charles.tutorialmod.lists;

import com.charles.tutorialmod.main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList
{
	public static final DeferredRegister<Block>	BLOCKS = new DeferredRegister<Block>(ForgeRegistries.BLOCKS, main.MOD_ID);
	
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> TUTORIAL_SLAB = BLOCKS.register("tutorial_slab", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> TUTORIAL_STAIRS = BLOCKS.register("tutorial_stairs", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).sound(SoundType.STONE)));
	
	public static final RegistryObject<Block> LIME_LINOLEUM = BLOCKS.register("lime_linoleum", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).sound(SoundType.STONE)));
	
	

}
