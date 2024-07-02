package org.example;
public class Main {
    public static void main(String[] args) {
        // Создаем массив 4x4
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };



        // Проверка и суммирование элементов массива
        try {
            int sum = ArrayChecker.checkArraySizeAndSum(validArray);
            System.out.println("Sum of valid array: " + sum);
        } catch (MyArraySizeException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.err.println("Error: " + e.getMessage());
            System.err.println("Invalid value: " + e.getInvalidValue() + " at row " + e.getRow() + ", column " + e.getCol());
        }


    }
}
