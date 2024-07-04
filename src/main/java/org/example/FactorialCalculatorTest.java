package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorialPositive() {
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
        assertEquals(1, FactorialCalculator.calculateFactorial(1));
        assertEquals(2, FactorialCalculator.calculateFactorial(2));
        assertEquals(6, FactorialCalculator.calculateFactorial(3));
        assertEquals(24, FactorialCalculator.calculateFactorial(4));
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(720, FactorialCalculator.calculateFactorial(6));
    }

    @Test
    public void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
    }
}
