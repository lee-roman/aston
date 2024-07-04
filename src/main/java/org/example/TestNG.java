package org.example;



import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestNG {

    @Test(description = "Тест: факториал 0 равен 1")
    public void testCalculateFactorialZero() {
        // Проверка, что факториал 0 равен 1
        assertEquals(FactorialCalculator.calculateFactorial(0), 1);
    }

    @Test(description = "Тест: факториал 1 равен 1")
    public void testCalculateFactorialOne() {
        // Проверка, что факториал 1 равен 1
        assertEquals(FactorialCalculator.calculateFactorial(1), 1);
    }

    @Test(description = "Тест: факториал 2 равен 2")
    public void testCalculateFactorialTwo() {
        // Проверка, что факториал 2 равен 2
        assertEquals(FactorialCalculator.calculateFactorial(2), 2);
    }

    @Test(description = "Тест: факториал 3 равен 6")
    public void testCalculateFactorialThree() {
        // Проверка, что факториал 3 равен 6
        assertEquals(FactorialCalculator.calculateFactorial(3), 6);
    }

    @Test(description = "Тест: факториал 4 равен 24")
    public void testCalculateFactorialFour() {
        // Проверка, что факториал 4 равен 24
        assertEquals(FactorialCalculator.calculateFactorial(4), 24);
    }

    @Test(description = "Тест: факториал 5 равен 120")
    public void testCalculateFactorialFive() {
        // Проверка, что факториал 5 равен 120
        assertEquals(FactorialCalculator.calculateFactorial(5), 120);
    }

    @Test(description = "Тест: факториал 6 равен 720")
    public void testCalculateFactorialSix() {
        // Проверка, что факториал 6 равен 720
        assertEquals(FactorialCalculator.calculateFactorial(6), 720);
    }

    @Test(description = "Тест: факториал отрицательного числа вызывает исключение")
    public void testCalculateFactorialNegative() {
        // Проверка, что факториал отрицательного числа вызывает IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
    }
}
