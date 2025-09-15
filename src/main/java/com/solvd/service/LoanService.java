package com.solvd.service;

import com.solvd.entity.BookCopy;
import com.solvd.entity.Loan;
import com.solvd.entity.Member;
import com.solvd.util.BetterArray;

import java.time.LocalDate;

public class LoanService {

    private static int MAX_BORROW_DAYS;

    static {
        MAX_BORROW_DAYS = 30;
    }

    private BetterArray<Loan> loans = new BetterArray<>();

    public LoanService() {
    }


    public void loanBook(Member member, BookCopy bookCopy) {
        long loanId = loans.size() + 1;
        LocalDate loanDate = LocalDate.now();
        LocalDate dueDate = loanDate.plusDays(MAX_BORROW_DAYS);

        Loan loan = new Loan(loanId, bookCopy, loanDate, dueDate);

        member.addLoan(loan);
        loans.add(loan);
    }


    public static void setMaxBorrowDays(int maxBorrowDays) {
        MAX_BORROW_DAYS = maxBorrowDays;
    }
}
