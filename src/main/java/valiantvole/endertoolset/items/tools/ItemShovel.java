package valiantvole.endertoolset.items.tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemTool;
import valiantvole.endertoolset.EnderToolset;
import valiantvole.endertoolset.items.ItemModelProvider;

public class ItemShovel extends net.minecraft.item.ItemSpade implements ItemModelProvider {
	
	private String name;
	
	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void registerItemModel(Item item) {
		EnderToolset.proxy.registerItemRenderer(this, 0, name);
		
	}
	
	

}
