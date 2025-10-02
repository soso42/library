package com.solvd;

import com.solvd.entity.items.BookCopy;
import com.solvd.entity.items.Library;
import com.solvd.entity.people.Member;
import com.solvd.service.LibraryService;
import com.solvd.service.LoanService;
import com.solvd.service.impl.LibraryServiceImpl;
import com.solvd.service.impl.LoanServiceImpl;
import com.solvd.util.DummyData;

public class Main {

    public static void main(String[] args) {

        Library library = DummyData.initLibraryData();
        LibraryService libraryService = new LibraryServiceImpl(library);
        LoanService loanService = new LoanServiceImpl();

        Member member = libraryService.getMemberById(1L);
        BookCopy bookCopy = libraryService.getBookCopyById(1L);

        // Polymorphism
//        libraryService.startWorkDay();
        loanService.loanBook(member, bookCopy);

        // Play all playables in Library
        libraryService.playAll();
    }

}
