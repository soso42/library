package com.solvd.entity;

public class BookCopy {

    private Long id;
    private Book book;
    private Shelf shelf;

    public BookCopy() {}

    public BookCopy(Long id) {
        this.id = id;
    }

    public BookCopy(Long id, Book book, Shelf shelf) {
        this.id = id;
        this.book = book;
        this.shelf = shelf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
