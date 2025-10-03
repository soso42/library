package com.solvd;

import com.solvd.command.Command;
import com.solvd.command.CommandFactory;
import com.solvd.enums.AccessLevel;
import com.solvd.exception.DataRestoreException;
import com.solvd.exception.UnknownCommandException;
import com.solvd.service.AppStateService;
import com.solvd.service.AuthService;
import com.solvd.service.impl.AppStateServiceImpl;
import com.solvd.service.impl.AuthServiceImpl;
import com.solvd.service.impl.LibraryServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AppFacade {

    private final AuthService authService = AuthServiceImpl.getInstance();
    private final Scanner scanner = new Scanner(System.in);
    private final CommandFactory commandFactory = new CommandFactory();

    private final Map<AccessLevel, Runnable> menus = Map.of(
            AccessLevel.LIBRARIAN, this::displayLibrarianMenu,
            AccessLevel.MEMBER, this::displayMemberMenu,
            AccessLevel.NONE, this::displayMainMenu
    );

    public void start() {

        restoreAppState();

        try {
            while (true) {
                AccessLevel accessLevel = authService.getAccessLevel();
                menus.get(accessLevel).run();

                String input = scanner.nextLine();

                try {
                    Command command = commandFactory.getCommand(input);
                    command.execute();
                } catch (UnknownCommandException e) {
                    System.out.println("\n!!!!!     UNKNOWN COMMAND. Please try again     !!!!!");
                }
            }
        } finally {
            scanner.close();
            System.out.println("Application shutting down. Resources released.");
        }
    }

    private void displayMainMenu() {
        System.out.println("""
                
                Welcome to the main menu!

                list of available commands:

                librarian  - logs you in as ADMIN
                member     - logs you in as USER
                exit       - exits the program

                Please type a command to continue:""");
    }

    private void displayLibrarianMenu() {
        System.out.println("""
                
                Welcome to the LIBRARIAN menu!

                list of available commands:

                view      - view all library resources (books, dvd, etc)
                exit      - exits the program

                Please type a command to continue:""");
    }

    private void displayMemberMenu() {
        System.out.println("""

                Welcome to the MEMBER menu!

                list of available commands:

                view      - view all library resources (books, dvd, etc)
                loan      - take a book on loan
                exit      - exits the program

                Please type a command to continue:""");
    }

    private void restoreAppState() {
        try (AppStateService appStateService = new AppStateServiceImpl(
                (LibraryServiceImpl) LibraryServiceImpl.getInstance()
        )) {
            appStateService.restoreAllData();
        } catch (Exception e) {
            throw new DataRestoreException("Restoring app data failed!");
        }
    }
}
