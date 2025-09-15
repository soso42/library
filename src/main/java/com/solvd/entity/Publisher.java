package com.solvd.entity;

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
