package me.friwi.arterion.client.data;

import me.friwi.arterion.client.ArterionClientMod;
import net.minecraft.util.ResourceLocation;

public class SkillDataList {
	private static final SkillDataEntry[] skills = new SkillDataEntry[5];
	private static final ResourceLocation[] skillIcons = new ResourceLocation[32];
	private static final ResourceLocation[] skillIconsGray = new ResourceLocation[32];
	
	static {
		for(int i = 0; i<skillIcons.length; i++) {
			if(i%5!=2) {
				skillIcons[i] = new ResourceLocation(ArterionClientMod.TEXMODID, "arterionclientmod/textures/gui/skill_icons/"+(i-1)+".bmp");
				skillIconsGray[i] = new ResourceLocation(ArterionClientMod.TEXMODID, "arterionclientmod/textures/gui/skill_icons/gray_"+(i-1)+".bmp");
			}
		}
	}
	
	public static void updateSkillData(SkillDataEntry entry) {
		skills[entry.getSlot()] = entry;
	}

	public static SkillDataEntry[] getSkills() {
		return skills;
	}
	
	public static ResourceLocation getSkillIcon(int skill, boolean gray) {
		return gray?skillIconsGray[skill+1]:skillIcons[skill+1];
	}
}
