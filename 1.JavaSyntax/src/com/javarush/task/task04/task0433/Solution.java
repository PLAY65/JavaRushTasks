package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        char s = 'S';
        int b = 10;

        while (b>0) {
            int a = 10;
            while (a > 0) {
                a--;
                System.out.print(s);
            }
            b--;
            System.out.println();
        }

    }
}
