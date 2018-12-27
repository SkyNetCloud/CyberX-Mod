package xyz.skynetcloud.cyberx.blocks.machines;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.blocks.BlockBase;
import xyz.skynetcloud.cyberx.blocks.tileentities.TileEntityPowerBlock;

public class PowerBlock extends BlockBase {

	public PowerBlock(String name, Material material, CreativeTabs tab) {
		super(name, material, tab);
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) 
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state)
	{
		return new TileEntityPowerBlock();
	}
}
