package com.solvd.service;

public interface AppStateService extends AutoCloseable {
    void restoreAllData();
}
