package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] str = new String[10];
        int[] arr = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            str[i] = reader.readLine();
            arr[i] = str[i].length();
        }
        for (int a: arr) {
            System.out.println(a);
        }

    }
}
