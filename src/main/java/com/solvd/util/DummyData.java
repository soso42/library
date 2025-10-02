package com.solvd.util;

import com.solvd.entity.items.*;
import com.solvd.entity.people.Author;
import com.solvd.entity.people.Librarian;
import com.solvd.entity.people.Member;

import java.time.Year;

public class DummyData {

    public static Library initLibraryData() {

        Library library = new Library(1L);

        Librarian librarian = new Librarian();
        library.addLibrarian(librarian);

        Member member = new Member();
        member.setId(1L);
        library.addMember(member);

        Author author = new Author(1L, "Eric", "Freeman");

        Publisher publisher = new Publisher(1L, "O'Reilly");

        Category category = new Category(1L, "Programming books");

        Book book = new Book("123456789", "Design Patterns", author, publisher, Year.of(2010), category);
        Shelf shelf = new Shelf(1L, "A1");
        BookCopy bookCopy1 = new BookCopy(1L, book, shelf);

        library.addBorrowable(bookCopy1);

        MovieDVD movie1 = new MovieDVD(10L, "The Terminal List", "FHD", 120L);
        MovieDVD movie2 = new MovieDVD(11L, "Fury", "FHD", 115L);
        AudioBook audioBook1 = new AudioBook("918237491", "Design Patterns, audio edition", author, publisher, Year.of(2024), category, 3600L);

        library.addBorrowable(movie1);
        library.addBorrowable(movie2);
        library.addBorrowable(audioBook1);

        return library;
    }

}
