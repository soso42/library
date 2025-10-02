package com.solvd.command.impl;

import com.solvd.command.Command;
import com.solvd.entity.items.BookCopy;
import com.solvd.entity.people.Member;
import com.solvd.exception.BookCopyNotFoundException;
import com.solvd.service.LibraryService;
import com.solvd.service.LoanService;
import com.solvd.service.impl.LibraryServiceImpl;
import com.solvd.service.impl.LoanServiceImpl;
import com.solvd.util.BetterArray;

import java.util.Scanner;

public class LoanCommand implements Command {

    private final LoanService loanService = LoanServiceImpl.getInstance();
    private final LibraryService libraryService = LibraryServiceImpl.getInstance();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {

        Member member = libraryService.getMemberById(1L);

        System.out.println("Which book do you want to take? List of available books: \n");

        BetterArray<BookCopy> books = libraryService.getAllBookCopies();
        books.stream().forEach(System.out::println);

        System.out.println("\nEnter the book ID you want to take: ");
        Long id = scanner.nextLong();

        BookCopy bookCopy = books.stream()
                        .filter(b -> b.getId().equals(id))
                        .findFirst()
                        .orElseThrow(() -> new BookCopyNotFoundException("Book ID " + id + " not found"));

        loanService.loanBook(member, bookCopy);

        System.out.println("Book Loaned. Thank you for using our library!");

        System.out.println("\nPress enter to continue...");
        scanner.nextLine();
        scanner.nextLine();
    }

}
