package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        try {
            long factorial = FactorialCalculator.calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
