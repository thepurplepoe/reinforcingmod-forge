package thepurplepoe.reinforcing.client.audio;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import thepurplepoe.reinforcing.util.Reference;

public class SoundHandler {
	
	private static int size = 0;
	
	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation(Reference.modID, name);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;
		return e;
	}

}