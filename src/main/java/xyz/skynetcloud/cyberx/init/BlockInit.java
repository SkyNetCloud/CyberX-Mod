package xyz.skynetcloud.cyberx.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPurpurSlab.Half;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import xyz.skynetcloud.cyberx.Main;
import xyz.skynetcloud.cyberx.blocks.BlockBase;
import xyz.skynetcloud.cyberx.blocks.RubyBlock;
import xyz.skynetcloud.cyberx.blocks.SteelBlock;
import xyz.skynetcloud.cyberx.blocks.VibraniumBlock;
import xyz.skynetcloud.cyberx.blocks.machines.PowerBlock;
import xyz.skynetcloud.cyberx.blocks.ores.RubyOre;
import xyz.skynetcloud.cyberx.blocks.ores.SteelOre;
import xyz.skynetcloud.cyberx.blocks.ores.VibraniumOre.EndVibraniumOre;


public class BlockInit 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	
	//Power Block
    public static final Block ENERGY_Block = new PowerBlock("power_block", Material.IRON, Main.CYBERTAB);

    //Dark Steel
    public static final Block DARK_STEEL_BLOCK = new SteelBlock("dark_steel_block", Material.IRON,Main.CYBERTAB);
    public static final Block DARK_STEEL_ORE = new SteelOre("dark_steel_ore", Material.GROUND, Main.CYBERTAB);

    //Ruby
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON, Main.CYBERTAB);
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.GOURD, Main.CYBERTAB);
    public static final Block Nether_RUBY_ORE = new BlockBase("nether_ruby_ore", Material.GOURD, Main.CYBERTAB);
    
    public static final Block DARKBLOCK = new BlockBase("block_dark", Material.GROUND, Main.CYBERTAB);
    
      
    //Vibarnium
    public static final Block VIBRANIUM_BLOCK = new VibraniumBlock("vibranium_block", Material.IRON, Main.CYBERTAB);
    public static final Block VIBRANIUM_ORE = new VibraniumBlock("vibranium_ore", Material.GROUND, Main.CYBERTAB);
    public static final Block END_VIBRANIUM_ORE = new BlockBase("end_vibranium_ore", Material.GOURD, Main.CYBERTAB);

 }
