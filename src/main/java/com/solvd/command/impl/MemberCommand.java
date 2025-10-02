package com.solvd.command.impl;

import com.solvd.command.Command;
import com.solvd.enums.AccessLevel;
import com.solvd.service.AuthService;
import com.solvd.service.impl.AuthServiceImpl;

public class MemberCommand implements Command {

    private final AuthService authService = AuthServiceImpl.getInstance();

    @Override
    public void execute() {
        this.authService.setAccessLevel(AccessLevel.MEMBER);
    }

}
