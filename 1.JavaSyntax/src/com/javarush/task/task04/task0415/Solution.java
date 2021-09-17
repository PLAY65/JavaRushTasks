package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a  = Integer.parseInt(reader.readLine());
        int b  = Integer.parseInt(reader.readLine());
        int c  = Integer.parseInt(reader.readLine());

        /*if ((a+b>c || a+c > b || b+c >a) && a+b!=c && a+c!=b && b+c!=a && b+a!=c)
            System.out.println("Треугольник существует.");
        else    System.out.println("Треугольник не существует.");*/

        if(a>=(b+c)) System.out.println("Треугольник не существует.");
        else if(b>=(a+c)) System.out.println("Треугольник не существует.");
        else if(c>=(b+a)) System.out.println("Треугольник не существует.");
        else System.out.println("Треугольник существует.");
    }
}