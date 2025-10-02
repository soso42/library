package com.solvd.command.impl;

import com.solvd.command.Command;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.exit(0);
    }

}
