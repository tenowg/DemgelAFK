package com.thedemgel.demgelafk.configuration;

import java.io.File;
import java.util.logging.Level;

import org.spout.cereal.config.ConfigurationException;
import org.spout.cereal.config.ConfigurationHolder;
import org.spout.cereal.config.ConfigurationHolderConfiguration;
import org.spout.cereal.config.yaml.YamlConfiguration;

import com.thedemgel.demgelafk.DemgelAFKPlugin;

/**
 * Provides an example of a class that has a configuration file.
 */
public class DemgelAFKConfiguration extends ConfigurationHolderConfiguration {

	// Messages
	public static final ConfigurationHolder SOME_SETTING = new ConfigurationHolder("SomeSetting", "some", "setting");

	public DemgelAFKConfiguration(File dataFolder) {
		super(new YamlConfiguration(new File(dataFolder, "config.yml")));
	}

	@Override
	public void load() {
		try {
			super.load();
			super.save();
		} catch (ConfigurationException e) {
			DemgelAFKPlugin.getInstance().getLogger().log(Level.WARNING, "Error loading DemgelAFK configuration: ", e);
		}
	}

	@Override
	public void save() {
		try {
			super.save();
		} catch (ConfigurationException e) {
			DemgelAFKPlugin.getInstance().getLogger().log(Level.WARNING, "Error saving DemgelAFK configuration: ", e);
		}
	}
}
