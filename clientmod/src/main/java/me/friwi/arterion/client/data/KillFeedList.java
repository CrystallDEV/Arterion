package me.friwi.arterion.client.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import me.friwi.arterion.client.ArterionClientMod;
import net.minecraft.util.ResourceLocation;

public class KillFeedList {
	private static List<KillFeedEntry> killFeedEntries = new LinkedList<KillFeedEntry>();
	
	private static final ResourceLocation[] killfeedIcons = new ResourceLocation[10];
	
	static {
		for(int i = 0; i<killfeedIcons.length; i++) {
			killfeedIcons[i] = new ResourceLocation(ArterionClientMod.TEXMODID, "arterionclientmod/textures/gui/kill_icons/"+i+".png");
		}
	}
	
	public static void addEntry(KillFeedEntry entry) {
		killFeedEntries.add(entry);
	}
	
	public static List<KillFeedEntry> getKillFeedEntries(){
		Iterator<KillFeedEntry> it = killFeedEntries.iterator();
		while(it.hasNext()) {
			if(it.next().isExpired())it.remove();
		}
		return killFeedEntries;
	}
	
	public static ResourceLocation getKillfeedIcon(int id) {
		return killfeedIcons[id];
	}
}
