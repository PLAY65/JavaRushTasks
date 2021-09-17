package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();//(Arrays.asList("мама","мыла","раму"));
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        for (int i=1;i<strings.size()+1;i+=2){
            strings.add(i,"именно");
        }

        for (String a : strings) {
            System.out.println(a);
        }
    }
}
