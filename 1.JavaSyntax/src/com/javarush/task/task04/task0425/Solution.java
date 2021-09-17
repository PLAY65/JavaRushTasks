package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        if (arr[0]>0 && arr[1]>0) System.out.println("1");
        else if (arr[0]<0 && arr[1]>0) System.out.println("2");
        else if (arr[0]<0 && arr[1]<0) System.out.println("3");
        else if (arr[0]>0 && arr[1]<0) System.out.println("4");
    }
}
