package com.solvd.exception;

public class BookCopyNotFoundException extends RuntimeException {
    public BookCopyNotFoundException(String message) {
        super(message);
    }
}
