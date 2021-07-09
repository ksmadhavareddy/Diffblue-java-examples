package com.examples.set3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class CurrenciesDoNotMatchExceptionTest {
    @Test
    public void testConstructor() {
        // Arrange and Act
        CurrenciesDoNotMatchException actualCurrenciesDoNotMatchException = new CurrenciesDoNotMatchException(
                "0123456789ABCDEF");

        // Assert
        assertNull(actualCurrenciesDoNotMatchException.getCause());
        assertEquals("com.examples.set3.CurrenciesDoNotMatchException: 0123456789ABCDEF",
                actualCurrenciesDoNotMatchException.toString());
        assertEquals(0, actualCurrenciesDoNotMatchException.getSuppressed().length);
        assertEquals("0123456789ABCDEF", actualCurrenciesDoNotMatchException.getMessage());
        assertEquals("0123456789ABCDEF", actualCurrenciesDoNotMatchException.getLocalizedMessage());
    }
}

