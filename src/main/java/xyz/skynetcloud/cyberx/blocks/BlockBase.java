package xyz.skynetcloud.cyberx.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.init.BlockInit;
import xyz.skynetcloud.cyberx.init.ItemInit;
import xyz.skynetcloud.cyberx.util.interfaces.IHasModel;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerModel(Item.getItemFromBlock(this), 0);
		
	}
	


}
