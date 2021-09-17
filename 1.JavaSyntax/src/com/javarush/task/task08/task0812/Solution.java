package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int max_count = 1;
        int temp=1;
        for (int i = 0; i < list.size()-1; i++) {

            if (list.get(i).equals(list.get(i + 1)))
            {
                temp++;
                if (temp>max_count) max_count=temp;
            }else temp=1;

        }

        System.out.println(max_count);
    }
}
