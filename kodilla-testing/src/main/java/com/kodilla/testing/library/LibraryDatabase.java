package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // Lists books having title beginning with titleFragment.
    public List<Book> listBooksWithCondition(String titleFragment);

    // Lists books borrowed by libraryUser.
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // Try to rent a book for libraryUser.
    // Returns true when success and false when book is unavailable to rent.
    public boolean rentABook(LibraryUser libraryUser, Book book);

    // Returns all books borrowed by libraryUser to the library.
    // Returns number of books returned.
    public int returnBooks(LibraryUser libraryUser);

}
