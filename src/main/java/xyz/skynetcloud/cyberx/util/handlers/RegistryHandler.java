package xyz.skynetcloud.cyberx.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.world.DimensionType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import xyz.skynetcloud.cyberx.commands.CommandTeleportDimension;
import xyz.skynetcloud.cyberx.init.BiomeInit;
import xyz.skynetcloud.cyberx.init.BlockInit;
import xyz.skynetcloud.cyberx.init.DimensionInit;
import xyz.skynetcloud.cyberx.init.ItemInit;
import xyz.skynetcloud.cyberx.init.RecipesInit;
import xyz.skynetcloud.cyberx.util.ModConfig;
import xyz.skynetcloud.cyberx.util.interfaces.IHasModel;
import xyz.skynetcloud.cyberx.world.generation.WorldGenOres;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event)
	{
		
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{		
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{

		GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
		ModConfig.save(event);
		
		
		DimensionInit.registerDimensions();
		BiomeInit.registerBiomes();
		
		
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{
	     RecipesInit.registerCrafting();
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{

	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandTeleportDimension());
	}
}
