package com.solvd.entity;

import com.solvd.util.BetterArray;

import java.time.LocalDate;

public class Member {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private BetterArray<Loan> loans = new BetterArray<>();

    public Member() {}

    public Member(Long id) {
        this.id = id;
    }

    public Member(Long id, String firstName, String lastName, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(int index) {
        loans.remove(index);
    }
}
