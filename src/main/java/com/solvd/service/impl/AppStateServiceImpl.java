package com.solvd.service.impl;

import com.solvd.entity.Borrowable;
import com.solvd.entity.items.*;
import com.solvd.entity.people.Author;
import com.solvd.entity.people.Librarian;
import com.solvd.entity.people.Member;
import com.solvd.service.AppStateService;
import com.solvd.util.BetterArray;

import java.time.Year;

public class AppStateServiceImpl implements AppStateService {

    private LibraryServiceImpl libraryService;

    public AppStateServiceImpl(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Data imported successfully.");
    }

    @Override
    public void restoreAllData() {

        BetterArray<Librarian> librarians = new BetterArray();
        Librarian librarian = new Librarian();
        librarians.add(librarian);
        libraryService.setLibrarians(librarians);

        BetterArray<Member> members = new BetterArray<>();
        Member member = new Member();
        member.setId(1L);
        members.add(member);
        libraryService.setMembers(members);

        BetterArray<Borrowable> borrowables = new BetterArray<>();

        Author author = new Author(1L, "Eric", "Freeman");
        Publisher publisher = new Publisher(1L, "O'Reilly");
        Category category = new Category(1L, "Programming books");
        Book book = new Book("123456789", "Design Patterns", author, publisher, Year.of(2010), category);
        Shelf shelf = new Shelf(1L, "A1");
        BookCopy bookCopy1 = new BookCopy(1L, book, shelf);

        MovieDVD movie1 = new MovieDVD(10L, "The Terminal List", "FHD", 120L);
        MovieDVD movie2 = new MovieDVD(11L, "Fury", "FHD", 115L);
        AudioBook audioBook1 = new AudioBook("918237491", "Design Patterns, audio edition", author, publisher, Year.of(2024), category, 3600L);
        borrowables.add(movie1);
        borrowables.add(movie2);
        borrowables.add(audioBook1);
        borrowables.add(bookCopy1);
        libraryService.setBorrowables(borrowables);
    }
}
