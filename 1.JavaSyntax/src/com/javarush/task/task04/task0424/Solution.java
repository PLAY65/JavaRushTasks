package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(reader.readLine());

        if(a==b) System.out.println(3);
        else if(b==c) System.out.println(1);
        else if(a==c) System.out.println(2);


    }
}
