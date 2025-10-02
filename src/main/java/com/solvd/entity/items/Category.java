package com.solvd.entity.items;

import com.solvd.entity.common.BaseEntity;

public class Category extends BaseEntity {

    private String name;

    public Category() {}

    public Category(Long id, String name) {
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
