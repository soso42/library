package com.solvd.entity;

import java.util.Objects;

public class Librarian extends LibraryParticipant {

    public Librarian() {}

    public Librarian(Long id, String firstName, String lastName, Long libraryAccessCardNumber) {
        super(id, firstName, lastName, libraryAccessCardNumber);
    }

    @Override
    public void performAction() {
        System.out.println("Librarian: Working at the counter...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Librarian{");
        sb.append("FistName='").append(getFirstName());
        sb.append(", LastName='").append(getLastName());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member member)) return false;
        return Objects.equals(getId(), member.getId()) &&
                Objects.equals(getFirstName(), member.getFirstName()) &&
                Objects.equals(getLastName(), member.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName());
    }
}
