package com.solvd.entity;

public abstract class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public Person() {}

    protected Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
