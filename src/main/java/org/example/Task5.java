package org.example;
// Вызвать через sout в главном методе
// System.out.println(Task5.isSumInRange(9, 2));
public class Task5 {
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
