package com.thedemgel.demgelafk.command;

import org.spout.api.command.annotated.CommandDescription;
import org.spout.api.command.annotated.Permissible;
import org.spout.api.command.CommandArguments;
import org.spout.api.command.CommandSource;
import org.spout.api.exception.CommandException;

import com.thedemgel.demgelafk.DemgelAFKPlugin;

/**
 * Provides an example of a class to hold commands.
 */
public class DemgelAFKCommands {
	private final DemgelAFKPlugin plugin;

	public DemgelAFKCommands(DemgelAFKPlugin instance) {
		this.plugin = instance;
	}

	/**
	 * Provides an example command that can be issued to the Spout server.
	 * @param source CommandSource
	 * @param args CommandArguments
	 * @throws CommandException
	 */
	@CommandDescription(aliases = { "command", "cmd" }, desc = "This is an example of what a command might look like. Try it out with /cmd !")
	@Permissible("DemgelAFK.some.permission")
	public void exampleCommand(CommandSource source, CommandArguments args) throws CommandException {
		// Calling this command will send whoever issued it the message below.
		source.sendMessage("The DemgelAFK plugin command has been successfully issued.");
	}
}
