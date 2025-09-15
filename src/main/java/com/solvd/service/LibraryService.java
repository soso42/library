package com.solvd.service;

import com.solvd.entity.Librarian;
import com.solvd.entity.Library;
import com.solvd.entity.LibraryParticipant;
import com.solvd.entity.Member;
import com.solvd.util.BetterArray;

public class LibraryService {

    private final Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

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

}
