package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = 0;
        int b = 0;

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        if (a <= 0)  throw new IllegalArgumentException();
        if (b <= 0)  throw new IllegalArgumentException();

        System.out.println(getNod(Math.abs(a), Math.abs(b)));
    }

    public static int getNod(int a, int b){
        if(b == 0) return a;
        return  getNod(b, a%b);
    }
}
