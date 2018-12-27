package xyz.skynetcloud.cyberx.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.init.ItemInit;
import xyz.skynetcloud.cyberx.util.interfaces.IHasModel;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
