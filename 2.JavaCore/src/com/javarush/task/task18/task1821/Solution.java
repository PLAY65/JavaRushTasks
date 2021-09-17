package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        //String fileName = "c:\\11\\text.txt";

        Map<Integer,Integer> integerMap = new TreeMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)){

            while (fileInputStream.available()>0){
                int key = fileInputStream.read();
                if (integerMap.containsKey(key)){
                    integerMap.put(key,integerMap.get(key).intValue()+1);
                }else {
                    integerMap.put(key,1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry: integerMap.entrySet()){

            int a = entry.getKey();
            System.out.println((char) a+ " " + entry.getValue());
        }


       // System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
