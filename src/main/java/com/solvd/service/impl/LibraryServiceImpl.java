package com.solvd.service.impl;

import com.solvd.entity.Playable;
import com.solvd.entity.items.AudioBook;
import com.solvd.entity.items.BookCopy;
import com.solvd.entity.items.MovieDVD;
import com.solvd.entity.people.Librarian;
import com.solvd.entity.items.Library;
import com.solvd.entity.people.LibraryParticipant;
import com.solvd.entity.people.Member;
import com.solvd.service.LibraryService;
import com.solvd.util.BetterArray;

import java.util.Objects;

public class LibraryServiceImpl implements LibraryService {

    private final Library library;

    public LibraryServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public void startWorkDay() {
        BetterArray<LibraryParticipant> people = new BetterArray<>();

        for (int i = 0; i < library.getMembers().size(); i++) {
            Member member = library.getMembers().get(i);
            people.add(member);
        }

        for (int i = 0; i < library.getLibrarians().size(); i++) {
            Librarian librarian = library.getLibrarians().get(i);
            people.add(librarian);
        }

        for (int i = 0; i < people.size(); i++) {
            LibraryParticipant libraryParticipant = people.get(i);
            libraryParticipant.performAction();
        }
    }

    @Override
    public Member getMemberById(Long memberId) {
        for (int i = 0; i < library.getMembers().size(); i++) {
            Member member = library.getMembers().get(i);
            if (member.getId() == memberId) {
                return member;
            }
        }
        return null;
    }

    @Override
    public BookCopy getBookCopyById(Long bookCopyId) {
        return library.getBorrowables().stream()
                .filter(e -> e instanceof BookCopy)
                .map(e -> (BookCopy) e)
                .filter(e -> Objects.equals(e.getId(), bookCopyId))
                .findFirst().orElseThrow(() -> new RuntimeException("BookCopy not found"));
    }

    @Override
    public void playAll() {
        library.getBorrowables().stream()
                .filter(e -> e instanceof MovieDVD || e instanceof AudioBook)
                .map(e -> (Playable) e)
                .forEach(Playable::play);
    }
}
