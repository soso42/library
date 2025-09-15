package com.solvd.util;

import com.solvd.entity.*;

import java.time.Year;

public class DummyData {

    public static Library initLibraryData() {

        Library library = new Library(1);

        Librarian librarian = new Librarian();
        library.addLibrarian(librarian);

        Member member = new Member();
        member.setId(1);
        library.addMember(member);

        Author author = new Author(1L, "Eric", "Freeman");

        Publisher publisher = new Publisher(1L, "O'Reilly");

        Category category = new Category(1L, "Programming books");

        Book book = new Book("123456789", "Design Patterns", author, publisher, Year.of(2010), category);

        Shelf shelf = new Shelf(1L, "A1");

        BookCopy copy1 = new BookCopy(1L, book, shelf);

        library.addBookCopies(copy1);

        return library;
    }

}
