package xyz.skynetcloud.cyberx.init;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import xyz.skynetcloud.cyberx.util.ModConfig;
import xyz.skynetcloud.cyberx.world.dimensions.DimensionLibrary;

public class DimensionInit 
{
	public static final DimensionType CYBER = DimensionType.register("Copper", "_copper", ModConfig.DIMENSION_CYBER_ID, DimensionLibrary.class, false);
	
	public static void registerDimensions()
	{
		DimensionManager.registerDimension(ModConfig.DIMENSION_CYBER_ID, CYBER);
	}
}
 