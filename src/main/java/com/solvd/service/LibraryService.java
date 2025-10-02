package com.solvd.service;

import com.solvd.entity.items.BookCopy;
import com.solvd.entity.people.Member;
import com.solvd.util.BetterArray;

public interface LibraryService {
    BetterArray<BookCopy> getAllBookCopies();
    Member getMemberById(Long memberId);
    BookCopy getBookCopyById(Long bookCopyId);
    void playAll();
}
