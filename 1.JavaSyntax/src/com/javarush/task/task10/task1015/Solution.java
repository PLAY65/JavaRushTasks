package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] result = new ArrayList[3];
        ArrayList<String> arrayList = new ArrayList<String>();
        result[0] = new ArrayList<String>();
        result[0].add("123");
        result[1] = new ArrayList<String>();
        result[1].add("456");
        result[2] = new ArrayList<String>();
        result[2].add("789");

        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}