package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        String userName1 = myObj.nextLine();
        int age = Integer.parseInt(myObj.nextLine());

        if (age<18) System.out.println("Подрасти еще");

    }
}
