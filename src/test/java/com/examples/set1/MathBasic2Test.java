package com.examples.set1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathBasic2Test {
    @Test
    public void testSumOfTwoNumbers() {
        // Arrange, Act and Assert
        assertEquals(20, MathBasic2.sumOfTwoNumbers(10, 10));
    }
}

