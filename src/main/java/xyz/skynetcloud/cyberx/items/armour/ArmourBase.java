package xyz.skynetcloud.cyberx.items.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.init.ItemInit;
import xyz.skynetcloud.cyberx.util.interfaces.IHasModel;

public class ArmourBase extends ItemArmor implements IHasModel
{
	public ArmourBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CYBERTAB);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
