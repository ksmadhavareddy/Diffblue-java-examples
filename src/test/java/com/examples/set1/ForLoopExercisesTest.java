package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ForLoopExercisesTest {
    @Test
    public void testIsPrime() {
        // Arrange, Act and Assert
        assertFalse(ForLoopExercises.isPrime(10));
        assertFalse(ForLoopExercises.isPrime(1));
        assertTrue(ForLoopExercises.isPrime(2));
        assertFalse(ForLoopExercises.isPrime(9));
        assertFalse(ForLoopExercises.isPrime(10));
        assertFalse(ForLoopExercises.isPrime(1));
        assertTrue(ForLoopExercises.isPrime(2));
        assertFalse(ForLoopExercises.isPrime(9));
    }

    @Test
    public void testSumUptoN() {
        // Arrange, Act and Assert
        assertEquals(55, ForLoopExercises.sumUptoN(10));
        assertEquals(55, ForLoopExercises.sumUptoN(10));
    }

    @Test
    public void testSumOfDivisors() {
        // Arrange, Act and Assert
        assertEquals(7, ForLoopExercises.sumOfDivisors(10));
        assertEquals(7, ForLoopExercises.sumOfDivisors(10));
    }

    @Test
    public void testPrintNumberTriangle() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        // Arrange and Act
        ForLoopExercises.printNumberTriangle(10);
    }

    @Test
    public void testPrintNumberTriangle2() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        // Arrange and Act
        ForLoopExercises.printNumberTriangle(10);
    }
}

