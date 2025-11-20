package library.Ex12.service;

import library.Ex12.model.Member;
import library.Ex12.model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {
    private final List<Book> books;
    private final List<Member> members;

    public LibraryService() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (book == null)
            throw new IllegalArgumentException("book cannot be null");
        books.add(book);
    }

    public void addMember(Member member) {
        if (member == null)
            throw new IllegalArgumentException("member cannot be null");
        members.add(member);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public List<Member> getMembers() {
        return new ArrayList<>(members);
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}
