package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        int max =0;
        strings = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        max = strings.get(1).length();
        for (String a: strings) {
            if(a.length() >= max) max = a.length();
        }

        for (String a: strings) {
            if(a.length() == max) System.out.println(a);
        }


    }
}
