package org.example;

public class Task13 {

        public static void main(String[] args) {
            int n = 5;
            int[][] array = new int[n][n];


            for (int i = 0; i < n; i++) {
                array[i][i] = 1;
            }


            printArray(array);
        }

        // Метод для печати двумерного массива
        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


