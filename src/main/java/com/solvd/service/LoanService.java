package com.solvd.service;

import com.solvd.entity.items.BookCopy;
import com.solvd.entity.people.Member;

public interface LoanService {
    void loanBook(Member member, BookCopy bookCopy);
}
