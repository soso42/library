package com.solvd.service;

import com.solvd.entity.items.BookCopy;
import com.solvd.entity.people.Member;

public interface LibraryService {
    void startWorkDay();
    Member getMemberById(Long memberId);
    BookCopy getBookCopyById(Long bookCopyId);
    void playAll();
}
