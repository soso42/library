package com.solvd.entity.people;

import com.solvd.entity.items.AccessCard;

public abstract class LibraryParticipant extends Person {

    private AccessCard accessCard;

    public LibraryParticipant() {}

    public LibraryParticipant(Long id, String firstName, String lastName, AccessCard accessCard) {
        super(id, firstName, lastName);
        this.accessCard = accessCard;
    }

    public abstract void performAction();

    public AccessCard getLibraryAccessCardNumber() {
        return accessCard;
    }

    public void setLibraryAccessCardNumber(AccessCard accessCard) {
        this.accessCard = accessCard;
    }
}
