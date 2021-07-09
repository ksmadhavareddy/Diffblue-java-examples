package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookEnhancedTest {
    @Test
    public void testConstructor() {
        // Arrange and Act
        BookEnhanced actualBookEnhanced = new BookEnhanced("Name", 1);
        actualBookEnhanced.setName("Name");

        // Assert
        assertEquals(1, actualBookEnhanced.getCopies());
        assertEquals("Name", actualBookEnhanced.getName());
    }

    @Test
    public void testSetCopies() {
        // Arrange
        BookEnhanced bookEnhanced = new BookEnhanced("Name", 1);

        // Act
        bookEnhanced.setCopies(1);

        // Assert
        assertEquals(1, bookEnhanced.getCopies());
    }

    @Test
    public void testSetCopies2() {
        // Arrange
        BookEnhanced bookEnhanced = new BookEnhanced("Name", 1);

        // Act
        bookEnhanced.setCopies(-1);

        // Assert that nothing has changed
        assertEquals(1, bookEnhanced.getCopies());
        assertEquals("Name", bookEnhanced.getName());
    }
}

