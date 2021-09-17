package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        String temp;

        for (int i = 0; i < 13; i++) {
            temp = strings.remove(4);
            strings.add(0,temp);
        }

        for (String a :strings) {
            System.out.println(a);
        }

    }
}
