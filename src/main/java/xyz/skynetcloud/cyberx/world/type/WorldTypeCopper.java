package xyz.skynetcloud.cyberx.world.type;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import xyz.skynetcloud.cyberx.init.BiomeInit;

public class WorldTypeCopper extends WorldType
{
	public WorldTypeCopper() 
	{
		super("Copper");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) 
	{
		BiomeProvider provider = new BiomeProviderSingle(BiomeInit.COPPER);
		return provider;
	}
}
