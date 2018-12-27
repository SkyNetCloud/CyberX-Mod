package xyz.skynetcloud.cyberx.world.biomes;


import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.biome.Biome;
import xyz.skynetcloud.cyberx.init.BlockInit;

public class BiomeCopper extends Biome 
{
	public BiomeCopper() 
	{
		super(new BiomeProperties("Copper").setBaseHeight(1.0F).setHeightVariation(1.0F).setRainDisabled().setTemperature(1.0F));
		
		topBlock = BlockInit.DARK_STEEL_BLOCK.getDefaultState();
		fillerBlock = BlockInit.DARK_STEEL_ORE.getDefaultState();	
		
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 5, 1, 5));
	}
}
