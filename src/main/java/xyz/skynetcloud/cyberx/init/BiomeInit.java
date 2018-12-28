package xyz.skynetcloud.cyberx.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.skynetcloud.cyberx.util.ModConfig;
import xyz.skynetcloud.cyberx.world.biomes.BiomeCopper;

public class BiomeInit 
{
	public static final Biome COPPER = new BiomeCopper();
	
	public static void registerBiomes()
	{
		initBiome(COPPER, "Copper", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
	}
	
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome); 
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		
		if(ModConfig.spawnCustomBiomesInOverworld)  
		{
			BiomeManager.addSpawnBiome(biome);
		}
		return biome;
	}
}
