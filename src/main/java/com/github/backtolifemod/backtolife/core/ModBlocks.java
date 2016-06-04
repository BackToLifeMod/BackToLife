package com.github.backtolifemod.backtolife.core;

import net.minecraft.block.Block;

import com.github.backtolifemod.backtolife.block.BlockFertilizationMachine;
import com.github.backtolifemod.backtolife.block.BlockFossilSlicer;
import com.github.backtolifemod.backtolife.block.BlockLaboratory;
import com.github.backtolifemod.backtolife.block.BlockTissueAnalyzer;

public class ModBlocks {
	
	public static Block laboratory_block;
	public static Block laboratory_light_panel;
	public static Block fossil_slicer;
	public static Block tissue_analyzer;
	public static Block fertilization_machine;

	public static void init(){
		laboratory_block = new BlockLaboratory(false);
		laboratory_light_panel = new BlockLaboratory(true);
		fossil_slicer = new BlockFossilSlicer();
		tissue_analyzer = new BlockTissueAnalyzer();
		fertilization_machine = new BlockFertilizationMachine();
	}
}
