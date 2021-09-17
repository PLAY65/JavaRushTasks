package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int y = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+d+"."+m+"."+y);

    }
}
