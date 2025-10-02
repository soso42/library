package com.solvd.entity.items;

import com.solvd.entity.Borrowable;
import com.solvd.entity.Printable;
import com.solvd.entity.common.BaseEntity;

public class BookCopy extends BaseEntity implements Borrowable, Printable {

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookCopy {");
        sb.append(" id= ").append(this.getId());
        sb.append(" book=").append(book.getTitle());
        sb.append(" }");
        return sb.toString();
    }
}
