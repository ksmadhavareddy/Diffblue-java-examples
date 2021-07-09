package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testConstructor() {
        // Arrange and Act
        Person actualPerson = new Person("Name");
        actualPerson.setEmail("jane.doe@example.org");
        actualPerson.setPhoneNumber("4105551212");

        // Assert
        assertEquals("jane.doe@example.org", actualPerson.getEmail());
        assertEquals("Name", actualPerson.getName());
        assertEquals("4105551212", actualPerson.getPhoneNumber());
        assertEquals("Name#jane.doe@example.org#4105551212", actualPerson.toString());
    }

    @Test
    public void testConstructor2() {
        // Arrange, Act and Assert
        assertEquals("Name", (new Person("Name")).getName());
    }
}

