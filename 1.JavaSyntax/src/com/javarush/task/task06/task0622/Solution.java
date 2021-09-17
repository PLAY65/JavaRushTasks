package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i]= Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int ar: arr) {
            System.out.println(ar);
        }
    }
}
