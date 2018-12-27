package xyz.skynetcloud.cyberx.blocks.slabs;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.init.ItemInit;
import xyz.skynetcloud.cyberx.util.interfaces.IHasModel;

public class BlockSlabHalfBase extends BlockSlabBase implements IHasModel
{
	public BlockSlabHalfBase(String name, Material materialIn, BlockSlab half, BlockSlab doubleSlab)
	{
		super(name, materialIn, half); 
		
		ItemInit.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
	}
}
