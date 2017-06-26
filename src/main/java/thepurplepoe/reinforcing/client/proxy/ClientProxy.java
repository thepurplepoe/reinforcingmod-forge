package thepurplepoe.reinforcing.client.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import thepurplepoe.reinforcing.ReinforcingMod;
import thepurplepoe.reinforcing.proxy.CommonProxy;
import thepurplepoe.reinforcing.util.Helper;
import thepurplepoe.reinforcing.util.Reference;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerBlockModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ReinforcingMod.StoneReinforcedDirt), 0, new ModelResourceLocation("reinforcing:stonedirt", "inventory"));
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(ReinforcingMod.StoneReinforcedWood), 0, new ModelResourceLocation("reinforcing:stonewood", "type=oak"));
	}
}
