package valiantvole.endertoolset.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.item.Item;
import valiantvole.endertoolset.EnderToolset;
import valiantvole.endertoolset.items.ItemModelProvider;



public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	
	@Override
	public void registerItemModel(Item item) {
		EnderToolset.proxy.registerItemRenderer(this, 0, name);
		
	}

}
