package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
