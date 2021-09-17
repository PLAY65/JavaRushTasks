package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] a = new int[4];
        int max =0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        max =a[0];
        for (int i = 0; i < a.length-1; i++) {
            if(a[i] < a[i+1] && a[i+1]>max)
                max = a[i+1];
        }
        System.out.println(max);

    }
}
