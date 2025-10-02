package com.solvd.command.impl;

import com.solvd.command.Command;
import com.solvd.entity.Borrowable;
import com.solvd.exception.ResourcesNotFoundException;
import com.solvd.service.LibraryService;
import com.solvd.service.impl.LibraryServiceImpl;
import com.solvd.util.BetterArray;

import java.util.Scanner;

public class ViewCommand implements Command {

    private final LibraryService libraryService = LibraryServiceImpl.getInstance();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void execute() {

        System.out.println("\nList of all available resources in library:\n");

        LibraryServiceImpl libraryServiceImpl = (LibraryServiceImpl) libraryService;
        BetterArray<Borrowable> resources = libraryServiceImpl.getBorrowables();

        if (resources.size() == 0) {
            throw new ResourcesNotFoundException("Library is empty. Nothing to display");
        }

        resources.stream().forEach(System.out::println);

        System.out.println("\nPress enter to continue...");
        scanner.nextLine();
    }

}