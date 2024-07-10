package org.example;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        long result = calculator.calculateFactorial(5);
        System.out.println("5! = " + result);
    }
}
