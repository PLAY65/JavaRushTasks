package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        double sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if (number==-1)
                break;
            sum +=number;
            count++;
        }
        System.out.println(sum/count);
    }
}

