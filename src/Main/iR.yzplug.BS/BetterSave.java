package iR.yzplug.BS;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerBlockPickEvent;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.plugin.PluginBase;

public class BetterSave extends PluginBase implements Listener {
	@Override
	public void onEnable(){
		this.getLogger().info("Now your server better saving");
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onPlayerMove(PlayerBlockPickEvent event){
		Player p = event.getPlayer();
		p.getLevel().saveChunks();
		p.getLevel().save(true);
	}

}
