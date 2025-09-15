package com.solvd.entity;

import com.solvd.util.BetterArray;

public class Library extends BaseEntity {

    private final BetterArray<Librarian> librarians = new BetterArray<>();
    private final BetterArray<Member> members = new BetterArray<>();
    private final BetterArray<BookCopy> bookCopies = new BetterArray<>();

    public Library(Long id) {
        super(id);
    }

    public BetterArray<Librarian> getLibrarians() {
        return librarians;
    }

    public BetterArray<Member> getMembers() {
        return members;
    }

    public BetterArray<BookCopy> getBookCopies() {
        return bookCopies;
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

    public Member getMemberById(Long memberId) {
        for (int i = 0; i < members.size(); i++) {
            Member member = members.get(i);
            if (member.getId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public void addBookCopies(BookCopy bookCopy) {
        this.bookCopies.add(bookCopy);
    }

    public void removeBookCopies(int index) {
        this.bookCopies.remove(index);
    }

    public BookCopy getBookCopyById(Long bookCopyId) {
        for (int i = 0; i < bookCopies.size(); i++) {
            BookCopy copy = bookCopies.get(i);
            if (copy.getId() != null && copy.getId() == bookCopyId) {
                return copy;
            }
        }
        return null;
    }

}
