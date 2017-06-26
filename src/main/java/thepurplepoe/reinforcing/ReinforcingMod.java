package thepurplepoe.reinforcing;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thepurplepoe.reinforcing.block.BlockReinforcedWood;
import thepurplepoe.reinforcing.proxy.CommonProxy;
import thepurplepoe.reinforcing.util.Reference;

@Mod(modid = Reference.modID, name = Reference.modName, version = Reference.modVersion, acceptedMinecraftVersions = Reference.modMinecraftVersion)
public class ReinforcingMod {
	
	/** Creative Tab */
	public static CreativeTabs tab = new CreativeTabs("Reinforcing") {
        public Item getTabIconItem() {
                return Items.BAKED_POTATO;        }
    };
    
	public static Block StoneReinforcedDirt = new Block(Material.GROUND).setCreativeTab(tab).setHardness(0.5F).setUnlocalizedName("stonedirt").setRegistryName("stonedirt");
	public static Block StoneReinforcedWood = new BlockReinforcedWood(Material.GROUND).setCreativeTab(tab).setHardness(0.5F).setUnlocalizedName("stonewood").setRegistryName("stonewood");
	
	public static ItemBlock StoneReinforcedDirtItem = (ItemBlock) new ItemBlock(StoneReinforcedDirt).setRegistryName(StoneReinforcedDirt.getRegistryName());
	public static ItemBlock StoneReinforcedWoodItem = (ItemBlock) new ItemBlock(StoneReinforcedWood).setRegistryName(StoneReinforcedWood.getRegistryName());
	
	/** The current instance of the mod */
	@Instance(Reference.modID)
	public static ReinforcingMod instance;
	
	/** The proxy */
	@SidedProxy(clientSide = Reference.clientProxy, serverSide = Reference.commonProxy)
	public static CommonProxy proxy;
	
	/**
	 * Handles preinitialization 
	 * i.e Registering blocks, items, entities
	 */
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {					
		// Initialize SoundHandler
		//SoundHandler.init();
		
		GameRegistry.register(StoneReinforcedDirt);
		GameRegistry.register(StoneReinforcedWood);
		GameRegistry.register(StoneReinforcedDirtItem);
		GameRegistry.register(StoneReinforcedWoodItem);
		
		proxy.registerBlockModel();
	}
	
	/**
	 * Handles initialization
	 * i.e crafting recipes, world provider, renderers
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		// Register Entity Renderers
	}
	
	/**
	 * Handles postinitialization
	 * i.e. inter mod stuff
	 */
	@EventHandler 
	public void postinit(FMLPostInitializationEvent event) {
	}
}