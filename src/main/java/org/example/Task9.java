package org.example;
// Вызвать через sout в главном методе
//System.out.println(Task9.isLeapYear(2024));
public class Task9 {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}
