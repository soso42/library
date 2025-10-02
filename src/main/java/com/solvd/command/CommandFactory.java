package com.solvd.command;

import com.solvd.command.impl.*;
import com.solvd.exception.UnknownCommandException;

import java.util.Map;

public class CommandFactory {

    private final Map<String, Command> commands = Map.of(
            "librarian", new LibrarianCommand(),


            "member", new MemberCommand(),
            "loan", new LoanCommand(),

            "view", new ViewCommand(),

            "exit", new ExitCommand()
    );

    public Command getCommand(String commandName) throws UnknownCommandException {
        Command command = commands.get(commandName);
        if (command == null) {
            throw new UnknownCommandException("Command is unknown: " + commandName);
        }
        return command;
    }

}
