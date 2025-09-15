package com.solvd.entity;

public class Shelf extends BaseEntity {

    private String locationCode;

    public Shelf() {}

    public Shelf(Long id, String locationCode) {
        super(id);
        this.locationCode = locationCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
}
