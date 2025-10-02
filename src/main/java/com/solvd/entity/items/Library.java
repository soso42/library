package com.solvd.entity.items;

import com.solvd.entity.Borrowable;
import com.solvd.entity.common.BaseEntity;
import com.solvd.entity.people.Librarian;
import com.solvd.entity.people.Member;
import com.solvd.util.BetterArray;


public class Library extends BaseEntity {

    private final BetterArray<Librarian> librarians;
    private final BetterArray<Member> members;
    private final BetterArray<Borrowable> borrowables;

    public Library(Long id) {
        super(id);
        this.librarians = new BetterArray<>();
        this.members = new BetterArray<>();
        this.borrowables = new BetterArray<>();
    }

    public BetterArray<Librarian> getLibrarians() {
        return librarians;
    }

    public BetterArray<Member> getMembers() {
        return members;
    }

    public BetterArray<Borrowable> getBorrowables() {
        return this.borrowables;
    }

    public void addLibrarian(Librarian librarian) {
        this.librarians.add(librarian);
    }

    public void removeLibrarians(int index) {
        this.librarians.remove(index);
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMembers(int index) {
        this.members.remove(index);
    }

    public void addBorrowable(Borrowable borrowable) {
        this.borrowables.add(borrowable);
    }

    public void removeBookCopies(int index) {
        this.borrowables.remove(index);
    }

}
