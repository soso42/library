package com.solvd.entity;

public class Shelf {

    private Long id;
    private String locationCode;

    public Shelf() {}

    public Shelf(Long id, String locationCode) {
        this.id = id;
        this.locationCode = locationCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
}
