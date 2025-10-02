package com.solvd.service;

import com.solvd.enums.AccessLevel;

public interface AuthService {
    AccessLevel getAccessLevel();
    void setAccessLevel(AccessLevel accessLevel);
}
