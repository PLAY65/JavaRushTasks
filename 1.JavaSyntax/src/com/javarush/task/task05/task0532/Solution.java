package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int n = Integer.parseInt(reader.readLine());

        if(n>0) {
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                if(i==0) maximum = number;

                maximum = maximum >= number ? maximum : number;
            }



                System.out.println(maximum);
        }
    }
}
