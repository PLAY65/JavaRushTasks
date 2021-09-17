package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        String userName1 = myObj.nextLine();
        String userName2 = myObj.nextLine();

        if (userName1.equals(userName2)) System.out.println("Имена идентичны");
        else if(userName1.length() == userName2.length()) System.out.println("Длины имен равны");
    }
}
