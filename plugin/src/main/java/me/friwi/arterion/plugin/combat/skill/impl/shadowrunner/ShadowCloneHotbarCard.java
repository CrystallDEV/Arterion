package me.friwi.arterion.plugin.combat.skill.impl.shadowrunner;

import me.friwi.arterion.plugin.ui.hotbar.HotbarCard;
import me.friwi.arterion.plugin.ui.hotbar.NotForModUser;
import me.friwi.arterion.plugin.ui.hotbar.PriorityHotbarCard;
import me.friwi.arterion.plugin.ui.progress.ProgressBar;

public class ShadowCloneHotbarCard extends HotbarCard implements PriorityHotbarCard, NotForModUser {
    ShadowCloneSkill.ShadowCloneSkillContainerData data;

    public ShadowCloneHotbarCard(long duration, ShadowCloneSkill.ShadowCloneSkillContainerData data) {
        super(duration);
        this.data = data;
    }

    @Override
    public String getMessage() {
        long remaining = getExpires() - System.currentTimeMillis();
        float percentage = (remaining + 0f) / (duration + 0f);
        if (data.expires < System.currentTimeMillis()) {
            this.setExpires(0);
            percentage = 0;
        }
        return ProgressBar.generate("\2474", percentage, 40);
    }
}
