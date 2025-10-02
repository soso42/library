package com.solvd.service.impl;

import com.solvd.entity.items.BookCopy;
import com.solvd.entity.items.Loan;
import com.solvd.entity.people.Member;
import com.solvd.service.LoanService;
import com.solvd.util.BetterArray;

import java.time.LocalDate;

public class LoanServiceImpl implements LoanService {

    private static int maxBorrowDays;

    static {
        maxBorrowDays = 30;
    }

    private BetterArray<Loan> loans = new BetterArray<>();

    public LoanServiceImpl() {
    }


    @Override
    public void loanBook(Member member, BookCopy bookCopy) {
        long loanId = loans.size() + 1;
        LocalDate loanDate = LocalDate.now();
        LocalDate dueDate = loanDate.plusDays(maxBorrowDays);

        Loan loan = new Loan(loanId, bookCopy, loanDate, dueDate);

        member.addLoan(loan);
        loans.add(loan);
    }


    public static void setMaxBorrowDays(int newMaxBorrowDays) {
        maxBorrowDays = newMaxBorrowDays;
    }
}
