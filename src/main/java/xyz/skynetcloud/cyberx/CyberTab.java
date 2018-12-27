package xyz.skynetcloud.cyberx;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CyberTab extends CreativeTabs {


	public CyberTab(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.APPLE);
	}

}
