package com.thedemgel.demgelafk;

import org.spout.api.event.EventHandler;
import org.spout.api.event.player.PlayerChatEvent;
import org.spout.api.event.Listener;

/**
 * Provides an example of an event listener class.
 */
public class DemgelAFKListener implements Listener {
	private DemgelAFKPlugin plugin;

	public DemgelAFKListener(DemgelAFKPlugin instance) {
		this.plugin = instance;
	}

	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		// Do Something on PlayerChatEvent
	}
}
