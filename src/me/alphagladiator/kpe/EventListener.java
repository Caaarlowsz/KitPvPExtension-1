package me.alphagladiator.kpe;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class EventListener implements Listener {

	@EventHandler
	public void deathEvent(PlayerDeathEvent e){
		e.getDrops().clear();
	}
	
	@EventHandler
	public void respawnEvent(PlayerRespawnEvent e){
		Player p = e.getPlayer();
		p.performCommand("kit");
	}
	
}
