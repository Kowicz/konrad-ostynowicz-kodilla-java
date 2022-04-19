package com.kodilla.testing.library;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret Life of Programmers", "Steve Wolowitz", 2016);
        Book book4 = new Book("Secrets of Java","Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        //Then
        assertEquals(4,theListOfBooks.size());

    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("Zero books")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("Forty books")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("Zero books");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("Forty books");

        //Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("IT");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, never()).listBooksWithCondition(anyString());
    }

    @Test()
    void testListBooksInHandsOf() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser libraryUser0 = new LibraryUser("Jan", "Kowalski", "12345678901");
        LibraryUser libraryUser1 = new LibraryUser("Adam", "Nowak", "23456789012");
        LibraryUser libraryUser5 = new LibraryUser("Krystyna", "Kołodziej", "34567890123");

        List<Book> resultListOfBooks0 = new ArrayList<>();
        List<Book> resultListOfBooks1 = generateListOfNBooks(1);
        List<Book> resultListOfBooks5 = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser0)).thenReturn(resultListOfBooks0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(resultListOfBooks1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser5)).thenReturn(resultListOfBooks5);


        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser0);
        List<Book> theListOfBooks1 = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theListOfBooks5 = bookLibrary.listBooksInHandsOf(libraryUser5);

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(1, theListOfBooks1.size());
        assertEquals(5, theListOfBooks5.size());
    }
    
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int i = 0; i < booksQuantity; i++) {
            resultList.add(new Book("Title " + i, "Author " + i, 1970 + i));
        }

        return resultList;
    }
}
