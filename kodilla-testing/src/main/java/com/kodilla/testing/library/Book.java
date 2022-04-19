package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;

        Book book = (Book) object;

        return this.getPublicationYear() == book.getPublicationYear() &&
                Objects.equals(this.getTitle(), book.getTitle()) &&
                Objects.equals(this.getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.getAuthor(), this.getPublicationYear());
    }
}
