package valiantvole.endertoolset.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemTool;
import valiantvole.endertoolset.items.tools.ItemAxe;
import valiantvole.endertoolset.items.tools.ItemHoe;
import valiantvole.endertoolset.items.tools.ItemPickaxe;
import valiantvole.endertoolset.items.tools.ItemShovel;
import valiantvole.endertoolset.items.tools.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import valiantvole.endertoolset.ItemBase;
import valiantvole.endertoolset.EnderToolset;

public class ModItems {
	
	public static ItemSword enderSword = new ItemSword(EnderToolset.enderToolMaterial, "ender_sword");
	public static ItemAxe enderAxe = new ItemAxe(EnderToolset.enderToolMaterial, "ender_axe");
	public static ItemPickaxe enderPickaxe = new ItemPickaxe(EnderToolset.enderToolMaterial, "ender_pickaxe");
	public static ItemShovel enderShovel = new ItemShovel(EnderToolset.enderToolMaterial, "ender_shovel");
	public static ItemHoe enderHoe = new ItemHoe(EnderToolset.enderToolMaterial, "ender_hoe");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(    
				enderSword,
				enderAxe,
				enderPickaxe,
				enderShovel,
				enderHoe
				
	    );      
	}

	public static void registerModels() {
		enderSword.registerItemModel(enderSword);
		enderAxe.registerItemModel(enderAxe);
		enderPickaxe.registerItemModel(enderPickaxe);
		enderShovel.registerItemModel(enderShovel);
		enderHoe.registerItemModel(enderHoe);
	}

	public static void init() {

	}
	
}