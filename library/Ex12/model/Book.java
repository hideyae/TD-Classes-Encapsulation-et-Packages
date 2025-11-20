package library.Ex12.model;

import java.util.Objects;

public class Book {
    private final String isbn, title, author;

    public Book(String isbn, String title, String author) {
        if (isbn == null || isbn.isBlank())
            throw new IllegalArgumentException("ISBN cannot be blank");
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title cannot be blank");
        if (author == null || author.isBlank())
            throw new IllegalArgumentException("Author cannot be blank");
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
