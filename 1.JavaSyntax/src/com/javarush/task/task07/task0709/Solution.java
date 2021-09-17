package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        int min =0;
        ArrayList<String> strings = new ArrayList<String>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        min = strings.get(0).length();

        for (String a: strings) {
            if(a.length() <= min) min = a.length();
        }

        for (String a: strings) {
            if(a.length() == min) System.out.println(a);
        }
                
    }
}
