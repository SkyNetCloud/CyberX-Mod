package xyz.skynetcloud.cyberx.util;



import java.io.File;

import akka.actor.FSM.Event;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.skynetcloud.cyberx.Main;

public class ModConfig {
	
	
	public static int DIMENSION_CYBER_ID = 12;

	public static Configuration config;
	
	//config options

	
	//blocks

	//special upgrades

	
	//killer kills players?

	
	//rf options
	public static boolean rfSupport;
	public static int rfCost;
	public static int rfStored;
	public static int rfRate;
	public static int rfStorageFactor;
	
	//misc options
	public static boolean spawnCustomBiomesInOverworld = true;
	
	//machine levels

	
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Other";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		
		//rf options
		rfSupport = config.getBoolean("enableRF", "general", true, "Set to false to disable RF support in this mod");
		
		rfCost = config.getInt("rfCost", "rfoptions", 40, 1, 50000, "RF per tick that the machines use");
		if (rfCost<=0) rfCost = 1000; //Cheater! Take that! :P
		
		rfStored = config.getInt("rfStored", "rfoptions", 40000, rfCost, 100000, "Amount of RF that the Engines store, needs to be at least the same as the cost");
		if (rfStored<rfCost) rfStored = rfCost;
		
		rfRate = config.getInt("rfRate", "rfoptions", 1000, 1, 100000, "The max rate at which RF can flow into the machines");
		if (rfRate<=0) rfRate = 1000;
		
		rfStorageFactor = config.getInt("rfStorageFactor", "rfoptions", 4, 1, 8, "The multiplier that is applied to the Capacitor RF storage size");
		if (rfStorageFactor<=0) rfStorageFactor = 1;
		
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		
		category = "Dimension IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the dimensions to ensure that they don't clash with other mod's ids");
		DIMENSION_CYBER_ID = config.getInt("DIMENSION_COPPER_ID", category, 2, 2, 999, "Set the ID for the Copper Dimension");
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");	
	
	
		config.addCustomCategoryComment("rfoptions", "Change the settings of how PA interacts with RF devices");
	}
	

	
	public static void save(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Main.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Main.MODID + ".cfg"));
		
	}

}
