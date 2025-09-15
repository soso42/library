package com.solvd.entity;

import com.solvd.util.BetterArray;

public class Library {

    private final long id;
    private final BetterArray<Librarian> librarians = new BetterArray<>();
    private final BetterArray<Member> members = new BetterArray<>();
    private final BetterArray<BookCopy> bookCopies = new BetterArray<>();


    public Library(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
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
