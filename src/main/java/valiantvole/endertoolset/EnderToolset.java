package valiantvole.endertoolset;

	import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
    import net.minecraftforge.fml.common.SidedProxy;
    import net.minecraftforge.fml.common.event.FMLInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
	import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import valiantvole.endertoolset.proxy.CommonProxy;
import valiantvole.endertoolset.items.ModItems;
import valiantvole.endertoolset.proxy.ClientProxy;

	@Mod(modid = EnderToolset.modId, name = EnderToolset.name, version = EnderToolset.version)
	public class EnderToolset {

		public static final String modId = "endertoolset";
		public static final String name = "Ender Toolset";
		public static final String version = "1.0";
		
		@Mod.EventBusSubscriber
		public static class RegistrationHandler {
			
			@SubscribeEvent
			public static void registerItems(RegistryEvent.Register<Item> event) {
				ModItems.register(event.getRegistry());
			}
			
			@SubscribeEvent
			public static void registerItems(ModelRegistryEvent event) {
				ModItems.registerModels();
			}

		}
		
		@Mod.Instance(modId)
		public static EnderToolset instance;

		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			System.out.println(name + " is loading!");
			ModItems.init();
			
		}

		@Mod.EventHandler
		public void init(FMLInitializationEvent event) {
			
		}

		@Mod.EventHandler
		public void postInit(FMLPostInitializationEvent event) {

		}
		
		@SidedProxy(serverSide = "valiantvole.endertoolset.proxy.CommonProxy", clientSide = "valiantvole.endertoolset.proxy.ClientProxy")
		public static CommonProxy proxy;
		
		public static final Item.ToolMaterial enderToolMaterial = EnumHelper.addToolMaterial("ENDER", 2, 300, 6, 2, 18);
		
		
		
	}

