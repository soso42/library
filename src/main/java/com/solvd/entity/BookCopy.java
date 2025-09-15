package com.solvd.entity;

public class BookCopy extends BaseEntity {

    private Book book;
    private Shelf shelf;

    public BookCopy() {}

    public BookCopy(Long id) {
        super(id);
    }

    public BookCopy(Long id, Book book, Shelf shelf) {
        super(id);
        this.book = book;
        this.shelf = shelf;
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
