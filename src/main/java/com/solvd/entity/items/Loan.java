package com.solvd.entity.items;

import com.solvd.entity.common.BaseEntity;

import java.time.LocalDate;
import java.util.Objects;

public class Loan extends BaseEntity {

    private BookCopy bookCopy;
    private LocalDate loanDate;
    private LocalDate dueDate;

    public Loan() {}

    public Loan(Long id, BookCopy bookCopy, LocalDate loanDate, LocalDate dueDate) {
        super(id);
        this.bookCopy = bookCopy;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
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

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + getId() +
                ", bookCopy=" + (bookCopy != null ? bookCopy.getId() : null) +
                ", loanDate=" + loanDate +
                ", dueDate=" + dueDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan)) return false;
        Loan loan = (Loan) o;
        return Objects.equals(getId(), loan.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
