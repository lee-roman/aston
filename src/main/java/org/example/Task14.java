package org.example;

public class Task14 {

        public static void main(String[] args) {

            int len = 5;
            int initialValue = 10;
            int[] newArray = generateArray(len, initialValue);


            printArray(newArray);
        }


        public static int[] generateArray(int len, int initialValue) {
            int[] array = new int[len];

            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }

            return array;
        }


        public static void printArray(int[] array) {
            System.out.print("[ ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("]");
        }
    }


