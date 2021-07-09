package com.examples.set3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AmountTest {
    @Test
    public void testAdd() throws CurrenciesDoNotMatchException {
        // Arrange
        Amount amount = new Amount("Currency", 10);

        // Act
        amount.add(new Amount("Currency", 10));

        // Assert
        assertEquals("20 Currency", amount.toString());
    }

    @Test
    public void testAdd2() throws CurrenciesDoNotMatchException {
        // Arrange
        Amount amount = new Amount("42", 10);

        // Act and Assert
        assertThrows(CurrenciesDoNotMatchException.class, () -> amount.add(new Amount("Currency", 10)));
    }

    @Test
    public void testConstructor() {
        // Arrange, Act and Assert
        assertEquals("10 Currency", (new Amount("Currency", 10)).toString());
    }
}

