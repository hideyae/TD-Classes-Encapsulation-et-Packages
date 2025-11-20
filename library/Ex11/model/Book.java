package library.Ex11.model;

import java.util.Objects;

import library.Ex11.model.Book;

public class Book {
    private String isbn, title, author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + ", Title: " + this.title + ", Author: " + this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Book))
            return false;
        Book b = (Book) o;
        return isbn.equals(b.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}
