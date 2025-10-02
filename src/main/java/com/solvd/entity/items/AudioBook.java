package com.solvd.entity.items;

import com.solvd.entity.Borrowable;
import com.solvd.entity.Playable;
import com.solvd.entity.people.Author;

import java.time.Year;

public class AudioBook extends Book implements Playable, Borrowable {

    private Long lengthInSeconds;

    public AudioBook(String isbn, String title, Author author, Publisher publisher,
                     Year publishedYear, Category category, Long lengthInSeconds) {
        super(isbn, title, author, publisher, publishedYear, category);
        this.lengthInSeconds = lengthInSeconds;
    }

    public Long getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(Long lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    @Override
    public void play() {
        System.out.println("Audiobook " + this.getTitle() + " is playing with low voice...");
    }
}
