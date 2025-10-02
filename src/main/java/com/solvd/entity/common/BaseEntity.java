package com.solvd.entity.common;

public abstract class BaseEntity {

    private Long id;

    public BaseEntity() {}

    public BaseEntity(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
