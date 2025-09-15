package com.solvd;

import com.solvd.entity.BookCopy;
import com.solvd.entity.Library;
import com.solvd.entity.Member;
import com.solvd.service.LoanService;
import com.solvd.util.DummyData;

public class Main {

    public static void main(String[] args) {

        Library library = DummyData.initLibraryData();
        LoanService loanService = new LoanService();

        Member member = library.getMemberById(1L);
        BookCopy bookCopy = library.getBookCopyById(1L);

        loanService.loanBook(member, bookCopy);

    }

}
