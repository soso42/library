package com.solvd.entity.people;

import com.solvd.entity.items.AccessCard;
import com.solvd.entity.items.Loan;
import com.solvd.util.BetterArray;

import java.util.Objects;


public class Member extends LibraryParticipant{

    private final BetterArray<Loan> loans;

    public Member() {
        this.loans = new BetterArray<>();
    }

    public Member(Long id, String firstName, String lastName, AccessCard accessCard) {
        super(id, firstName, lastName, accessCard);
        this.loans = new BetterArray<>();
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(int index) {
        loans.remove(index);
    }


    @Override
    public void performAction() {
        System.out.println("Member: sitting and reading a book");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
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
