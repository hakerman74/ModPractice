package events;

import org.apache.logging.log4j.Logger;

import com.charles.tutorialmod.main;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents
{
	public static final Logger LOGGER = main.LOGGER;
	public static final String MOD_ID = main.MOD_ID; 
	
	public static ResourceLocation location(String Name)
	{
		return new ResourceLocation(MOD_ID, Name);
	}

}
