package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void testConstructor() {
        // Arrange and Act
        Book actualBook = new Book("Name", 1);
        actualBook.decreaseNoOfCopies(1);
        actualBook.increaseNoOfCopies(1);

        // Assert
        assertEquals("Book[Name,1]", actualBook.toString());
    }

    @Test
    public void testConstructor2() {
        // Arrange and Act
        Book actualBook = new Book("Name", 1);
        actualBook.decreaseNoOfCopies(1);
        actualBook.increaseNoOfCopies(1);

        // Assert
        assertEquals("Book[Name,1]", actualBook.toString());
    }
}

