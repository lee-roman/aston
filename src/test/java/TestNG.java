import org.example.FactorialCalculator;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestNG {
    @Test(description = "Тест: факториал положительного числа")
    public void testCalculateFactorialPositive() {
        assertEquals(FactorialCalculator.calculateFactorial(10), 3628800);
    }

    @Test(description = "Тест: факториал отрицательного числа вызывает исключение")
    public void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculateFactorial(-1);
        });
    }

    @Test(description = "Тест: введенный символ не является числом")
    public void testCalculateFactorialNonNumericInput() {
        assertThrows(NumberFormatException.class, () -> {
            FactorialCalculator.calculateFactorial(Integer.parseInt("abc"));
        });
    }
}

