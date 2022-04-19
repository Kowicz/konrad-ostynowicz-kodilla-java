package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private  LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    // If number of books is greater than 20 - return empty list.
    // If number of characters in titleFragment is lesser than 3 - return empty list.
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();

        if (titleFragment.length() < 3) {
            return bookList;
        }

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() < 20) {
            bookList = resultList;
        }

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
