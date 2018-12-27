package xyz.skynetcloud.cyberx.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.items.ItemBase;
import xyz.skynetcloud.cyberx.items.armour.ArmourBase;
import xyz.skynetcloud.cyberx.items.tools.ToolAxeBase;
import xyz.skynetcloud.cyberx.items.tools.ToolHoeBase;
import xyz.skynetcloud.cyberx.items.tools.ToolPickaxeBase;
import xyz.skynetcloud.cyberx.items.tools.ToolShovelBase;
import xyz.skynetcloud.cyberx.items.tools.ToolSwordBase;
import xyz.skynetcloud.cyberx.commands.util.TeleporterDimension.TiggerItem;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Armour Materials 
	public static final ArmorMaterial ARMOUR_DARK_STEEL_MATERIAL = EnumHelper.addArmorMaterial("armour_dark_steel", Main.MODID + ":dark_steel", 23, new int[] {2,5,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final ArmorMaterial ARMOUR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armour_material_ruby", Main.MODID + ":ruby", 14, new int[] {2, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
		
	//Tool Materials 
	public static final ToolMaterial MATERIAL_DARK_STEEL = EnumHelper.addToolMaterial("material_dark_steel", 25, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 15, 250, 8.0F, 3.0F, 10);
	public static final ToolMaterial MATERIAL_VIBARNIUM = EnumHelper.addToolMaterial("masterial_vibarnium", 90, 600, 15.0F, 10.0F, 25);
	
	//Items
	public static final Item DARK_STEEL = new ItemBase("dark_steel", Main.CYBERTAB);
	public static final Item DARK_STEEL_DUST = new ItemBase("dark_steel_dust", Main.CYBERTAB);
	public static final Item RUBY = new ItemBase("ruby", Main.CYBERTAB);
	public static final Item RUBY_DUST = new ItemBase("ruby_dust", Main.CYBERTAB);
	public static final Item VIBRANIUM =  new ItemBase("vibranium", Main.CYBERTAB);
	public static final Item TiggerItem = new TiggerItem("", Main.CYBERTAB);
	
	//Dark Steel Tools
	public static final Item DARK_STEEL_AXE = new ToolAxeBase("dark_steel_axe", MATERIAL_DARK_STEEL, Main.CYBERTAB);
	public static final Item DARK_STEEL_PICKAXE = new ToolPickaxeBase("dark_steel_pickaxe", MATERIAL_DARK_STEEL, Main.CYBERTAB);
	public static final Item DARK_STEEL_HOE = new ToolHoeBase("dark_steel_hoe", MATERIAL_DARK_STEEL, Main.CYBERTAB);
	public static final Item DARK_STEEL_SWORD = new ToolSwordBase("dark_steel_sword", MATERIAL_DARK_STEEL, Main.CYBERTAB);
	public static final Item DARK_STEEL_SHOVEL = new ToolShovelBase("dark_steel_shovel", MATERIAL_DARK_STEEL, Main.CYBERTAB);
	// Ruby Tools
	public static final Item RUBY_SWORD = new ToolSwordBase("ruby_sword", MATERIAL_RUBY, Main.CYBERTAB);
	public static final Item RUBY_SHOVEL = new ToolShovelBase("ruby_shovel", MATERIAL_RUBY, Main.CYBERTAB);
	public static final Item RUBY_PICKAXE = new ToolPickaxeBase("ruby_pickaxe", MATERIAL_RUBY, Main.CYBERTAB);
	public static final Item RUBY_AXE = new ToolAxeBase("ruby_axe", MATERIAL_RUBY, Main.CYBERTAB);
	public static final Item RUBY_HOE = new ToolHoeBase("ruby_hoe", MATERIAL_RUBY, Main.CYBERTAB);
	
	//Dark Steel Armor
	public static final Item DARK_STEEL_HELMET = new ArmourBase("dark_steel_helmet", ARMOUR_DARK_STEEL_MATERIAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item DARK_STEEL_CHESTPLATE = new ArmourBase("dark_steel_chestplate", ARMOUR_DARK_STEEL_MATERIAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item DARK_STEEL_LEGGINGS = new ArmourBase("dark_steel_leggings", ARMOUR_DARK_STEEL_MATERIAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item DARK_STEEL_BOOTS = new ArmourBase("dark_steel_boots", ARMOUR_DARK_STEEL_MATERIAL, 1, EntityEquipmentSlot.FEET);
	
	//Ruby Armor
	public static final Item RUBY_HELMET = new  ArmourBase("ruby_helmet", ARMOUR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new  ArmourBase("ruby_chestplate", ARMOUR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new  ArmourBase("ruby_leggings", ARMOUR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new  ArmourBase("ruby_boots", ARMOUR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET); 
	
	//
	
}
