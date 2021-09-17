package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;

        do{
            a = Integer.parseInt(reader.readLine());
            sum +=a;
        }while(a != -1);

        System.out.println(sum);
    }
}
