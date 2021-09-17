package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int index_min = 0, index_max = 0, min=0, max=0;

        min  = strings.get(0).length();
        max  = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length()<min) {
                index_min = i;
                min = strings.get(i).length();
            }
            if (strings.get(i).length()>max) {
                index_max = i;
                max = strings.get(i).length();
            }
        }
        
        if (index_max<index_min){
            //System.out.println(index_max);
            System.out.println(strings.get(index_max));
        }
        else {
            //System.out.println(index_min);
            System.out.println(strings.get(index_min));
        }
        

    }
}
