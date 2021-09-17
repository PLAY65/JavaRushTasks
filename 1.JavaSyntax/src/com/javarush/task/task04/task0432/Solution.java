package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int times = Integer.parseInt(reader.readLine());

        while(times >0) {
            System.out.println(str);
            times--;
        }

    }
}
