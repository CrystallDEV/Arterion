package me.friwi.arterion.plugin.listener;

import me.friwi.arterion.plugin.ArterionPlugin;
import me.friwi.arterion.plugin.world.chunk.ArterionChunkUtil;
import me.friwi.arterion.plugin.world.region.Region;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;

public class BlockFormListener implements Listener {

    private ArterionPlugin plugin;

    public BlockFormListener(ArterionPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockForm(BlockFormEvent evt) {
        Region region = ArterionChunkUtil.getNonNull(evt.getBlock().getChunk()).getRegion();
        if (region.isStopDecay()) {
            evt.setCancelled(true);
            return;
        }
    }
}
