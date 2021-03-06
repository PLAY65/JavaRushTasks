package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> arr = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                arr.add(Integer.parseInt(reader.readLine()));
            }
        } catch (NumberFormatException | IOException e) {
            for (int a : arr) {
                System.out.println(a);
            }
        }
    }
}
