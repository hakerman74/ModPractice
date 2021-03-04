package com.charles.tutorialmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charles.tutorialmod.lists.BlockList;
import com.charles.tutorialmod.lists.ItemLists;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(main.MOD_ID)
@EventBusSubscriber(modid = main.MOD_ID, bus = Bus.MOD)
public class main 
{	
   public static main instance;
   public static final String MOD_ID = "charlestutorial";
   public static final Logger LOGGER = LogManager.getLogger();

   public main()
   {
	   instance = this;
	
	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	   
	modEventBus.addListener(this::setup);
	modEventBus.addListener(this::clientSetup);
	
	BlockList.BLOCKS.register(modEventBus);
	ItemLists.ITEMS.register(modEventBus);
   }
   
   @SubscribeEvent
   public static void createBlockItems(final RegistryEvent.Register<Item> event) {
	   final IForgeRegistry<Item> registry = event.getRegistry();
	   
	   BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
		   final Item.Properties properties = new Item.Properties().group(ItemGroup.MISC);
		   final BlockItem blockItem = new BlockItem(block, properties);
		   blockItem.setRegistryName(block.getRegistryName());
		   registry.register(blockItem);
	   });
   }
   
   private void setup(final FMLCommonSetupEvent event)
   {

   }

   private void clientSetup(final FMLClientSetupEvent event)
   {

   }	   

   public void onServerStarting(FMLServerStartingEvent event)
   {

   }

}



