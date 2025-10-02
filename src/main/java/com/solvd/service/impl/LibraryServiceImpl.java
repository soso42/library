package com.solvd.service.impl;

import com.solvd.entity.Borrowable;
import com.solvd.entity.Playable;
import com.solvd.entity.items.AudioBook;
import com.solvd.entity.items.BookCopy;
import com.solvd.entity.items.MovieDVD;
import com.solvd.entity.people.Librarian;
import com.solvd.entity.people.LibraryParticipant;
import com.solvd.entity.people.Member;
import com.solvd.service.LibraryService;
import com.solvd.util.BetterArray;

import java.util.Objects;

public class LibraryServiceImpl implements LibraryService {

    private static LibraryService libraryService;

    private BetterArray<Librarian> librarians;
    private BetterArray<Member> members;
    private BetterArray<Borrowable> borrowables;

    private LibraryServiceImpl() {
        this.librarians = new BetterArray<>();
        this.members = new BetterArray<>();
        this.borrowables = new BetterArray<>();
    }

    public BetterArray<Librarian> getLibrarians() {
        return librarians;
    }

    public BetterArray<Member> getMembers() {
        return members;
    }

    public BetterArray<Borrowable> getBorrowables() {
        return borrowables;
    }

    public void setLibrarians(BetterArray<Librarian> librarians) {
        this.librarians = librarians;
    }

    public void setMembers(BetterArray<Member> members) {
        this.members = members;
    }

    public void setBorrowables(BetterArray<Borrowable> borrowables) {
        this.borrowables = borrowables;
    }

    @Override
    public BetterArray<BookCopy> getAllBookCopies() {
        return borrowables.stream()
                .filter(e -> e instanceof BookCopy)
                .map(e -> (BookCopy) e)
                .collect(
                        () -> new BetterArray<>(),
                        BetterArray::add,
                        (a, b) -> b.stream().forEach(a::add)
                );
    }

    @Override
    public Member getMemberById(Long memberId) {
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            if (member.getId() == memberId) {
                return member;
            }
        }
        return null;
    }

    @Override
    public BookCopy getBookCopyById(Long bookCopyId) {
        return borrowables.stream()
                .filter(e -> e instanceof BookCopy)
                .map(e -> (BookCopy) e)
                .filter(e -> Objects.equals(e.getId(), bookCopyId))
                .findFirst().orElseThrow(() -> new RuntimeException("BookCopy not found"));
    }

    @Override
    public void playAll() {
        borrowables.stream()
                .filter(e -> e instanceof MovieDVD || e instanceof AudioBook)
                .map(e -> (Playable) e)
                .forEach(Playable::play);
    }


    public static LibraryService getInstance() {
        if (libraryService == null) {
            libraryService = new LibraryServiceImpl();
        }
        return libraryService;
    }
}
