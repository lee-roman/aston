package org.example;
public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        printArray(array); // Печать исходного массива

        flipArray(array); // Вызов метода для замены элементов массива

        printArray(array); // Печать измененного массива
    }

    // Метод для замены элементов массива: 0 на 1 и 1 на 0
    public static void flipArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    // Метод для печати массива
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
