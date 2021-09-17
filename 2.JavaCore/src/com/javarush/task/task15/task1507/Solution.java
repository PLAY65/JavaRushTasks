package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(2, 3, 8);
        printMatrix(2, 3, (byte) 0B1000_0000);
        printMatrix(2, 3, (float)2.1f);
        printMatrix(2, 3, (double)2.1);
        printMatrix(2, 3, '\u0066');
        printMatrix(2, 3, true);
        printMatrix(2, 2.1);
        printMatrix(2, true);
        //printMatrix("8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Byte value) {
        System.out.println("Заполняем объектами Byte");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Float value) {
        System.out.println("Заполняем объектами Float");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, char value) {
        System.out.println("Заполняем объектами Char");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, boolean value) {
        System.out.println("Заполняем объектами boolean");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, double value) {
        System.out.println("Заполняем объектами double1");
        printMatrix(m, 3, (Object) value);
    }

    public static void printMatrix(int m,  boolean value) {
        System.out.println("Заполняем объектами boolean1");
        printMatrix(m, 3, (Object) value);
    }
/*
    public static void printMatrix( String value) {
        System.out.println("Заполняем объектами String1");
        printMatrix(2, 3, (Object) value);
    }*/


}
