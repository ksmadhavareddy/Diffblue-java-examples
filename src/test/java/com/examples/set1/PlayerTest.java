package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testConstructor() {
        // Arrange, Act and Assert
        assertEquals("Name", (new Player("Name")).getName());
        assertEquals("Name", (new Player("Name")).getName());
    }
}

