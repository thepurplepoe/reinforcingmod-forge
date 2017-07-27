package thepurplepoe.reinforcing.block.states;

import net.minecraft.block.Block;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.util.IStringSerializable;

public class BlockStateReinforcedWood extends BlockStateContainer {

	public static final PropertyEnum<EnumWoodType> typeProperty = PropertyEnum.create("type", EnumWoodType.class);
	
	public BlockStateReinforcedWood(Block blockIn) {
		super(blockIn, typeProperty);	
	}

	public static enum EnumWoodType implements IStringSerializable {
		OAK,
		SPRUCE,
		BIRCH,
		JUNGLE,
		ACACIA,
		DARK_OAK;
		
		@Override
		public String getName() {
			return name().toLowerCase();
		}
	}
}
