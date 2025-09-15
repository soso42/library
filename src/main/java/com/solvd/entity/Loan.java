package com.solvd.entity;

import java.time.LocalDate;

public class Loan {

    private long id;
    private BookCopy bookCopy;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public Loan() {}

    public Loan(long id, BookCopy bookCopy, LocalDate loanDate, LocalDate dueDate) {
        this.id = id;
        this.bookCopy = bookCopy;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
