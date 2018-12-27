package xyz.skynetcloud.cyberx.world.dimensions;

import java.util.Random;

import javax.swing.text.html.parser.Entity;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;
import xyz.skynetcloud.cyberx.init.BiomeInit;
import xyz.skynetcloud.cyberx.init.DimensionInit;
import xyz.skynetcloud.cyberx.world.generation.chunks.ChunkGeneratorNetherTemplate;

public class DimensionLibrary extends WorldProvider
{
	
	
	public DimensionLibrary() 
	{
		this.biomeProvider = new BiomeProviderSingle(BiomeInit.COPPER);
		this.hasSkyLight = false;
		
	}
	
	@Override
	public DimensionType getDimensionType() 
	{
		return DimensionInit.CYBER;
	}
	
	@Override
	public IChunkGenerator createChunkGenerator() 
	{
		return new ChunkGeneratorNetherTemplate(world, true, world.getSeed());
	}
	
	@Override
	public boolean canRespawnHere() 
	{
		return false;
	}
	
	@Override
	public boolean isSurfaceWorld() 
	{
		return false;
	}
}
