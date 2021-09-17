package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {

            arrayList.add("a"+i);
        }

        System.out.println(arrayList.size());
        for (String a: arrayList) {
            System.out.println(a);
        }
    }
}
