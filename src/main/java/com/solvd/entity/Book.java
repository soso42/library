package com.solvd.entity;

import java.time.Year;

public class Book extends BaseEntity {

    private String isbn;
    private String title;
    private Author author;
    private Publisher publisher;
    private Year publishedYear;
    private Category category;

    public Book() {}

    public Book(String isbn, String title, Author author, Publisher publisher, Year publishedYear, Category category) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Year getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(Year publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
