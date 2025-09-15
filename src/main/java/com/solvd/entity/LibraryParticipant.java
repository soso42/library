package com.solvd.entity;

public abstract class LibraryParticipant extends Person {

    private Long libraryAccessCardNumber;

    public LibraryParticipant() {}

    public LibraryParticipant(Long id, String firstName, String lastName, Long libraryAccessCardNumber) {
        super(id, firstName, lastName);
        this.libraryAccessCardNumber = libraryAccessCardNumber;
    }

    public abstract void performAction();

    public Long getLibraryAccessCardNumber() {
        return libraryAccessCardNumber;
    }

    public void setLibraryAccessCardNumber(Long libraryAccessCardNumber) {
        this.libraryAccessCardNumber = libraryAccessCardNumber;
    }
}
