package com.solvd.entity.items;

import com.solvd.entity.common.BaseEntity;

public class Publisher extends BaseEntity {

    private String name;

    public Publisher() {}

    public Publisher(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
