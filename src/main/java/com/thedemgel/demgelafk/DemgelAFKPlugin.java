package com.thedemgel.demgelafk;

import org.spout.api.plugin.Plugin;
import org.spout.api.command.annotated.AnnotatedCommandExecutorFactory;

import com.thedemgel.demgelafk.command.DemgelAFKBaseCommand;
import com.thedemgel.demgelafk.command.DemgelAFKCommands;
import com.thedemgel.demgelafk.configuration.DemgelAFKConfiguration;

/**
 * Defines the main class of the plugin.
 */
public class DemgelAFKPlugin extends Plugin {
	private static DemgelAFKPlugin instance;
	private DemgelAFKConfiguration config;

	@Override
	public final void onLoad() {
		setInstance(this);
		config = new DemgelAFKConfiguration(getDataFolder());
		config.load();
		getLogger().info("loaded.");
	}

	@Override
	public final void onEnable() {
		// Register Base Command (/command)
		AnnotatedCommandExecutorFactory.create(new DemgelAFKBaseCommand(this));
		// Register Commands under Base Command (/command command)
		AnnotatedCommandExecutorFactory.create(new DemgelAFKCommands(this), getEngine().getCommandManager().getCommand("command"));

		// Register Events
		getEngine().getEventManager().registerEvents(new DemgelAFKListener(this), this);

		getLogger().info("enabled.");
	}

	@Override
	public final void onDisable() {
		getLogger().info("disabled.");
	}

	private static void setInstance(DemgelAFKPlugin plugin) {
		instance = plugin;
	}

	public static DemgelAFKPlugin getInstance() {
		return instance;
	}

	public final DemgelAFKConfiguration getConfig() {
		return config;
	}
}
