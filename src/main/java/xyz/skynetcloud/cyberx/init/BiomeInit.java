package xyz.skynetcloud.cyberx.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import xyz.skynetcloud.cyberx.util.ModConfig;
import xyz.skynetcloud.cyberx.world.biomes.DarknessLand;
import xyz.skynetcloud.cyberx.world.biomes.GlassBiome;

public class BiomeInit 
{
	public static final Biome GLASS_BIOME = new GlassBiome();
	public static final Biome DAKRNESS_BIOME = new DarknessLand();
	
	public static void registerBiomes()
	{
		initBiome(GLASS_BIOME, "Glass_Biome", BiomeType.WARM, Type.PLAINS, Type.DRY);
		initBiome(DAKRNESS_BIOME, "Darkness_Biome", BiomeType.COOL, Type.DEAD, Type.FOREST);
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
