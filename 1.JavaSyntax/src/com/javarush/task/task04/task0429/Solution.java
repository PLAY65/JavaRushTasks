package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int negative = 0;
        int positive = 0;

        if (a>0) positive++;
        else if (a<0) negative++;

        if (b>0) positive++;
        else if (b<0) negative++;

        if (c>0) positive++;
        else if (c<0) negative++;

        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+positive);


    }
}
