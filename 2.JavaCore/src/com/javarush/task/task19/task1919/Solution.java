package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1 = args[0];
        //String fileName1 = "c:/11/text1.txt";

        Map<String, Double> treeMap = new TreeMap<>();
        String str;

        try (BufferedReader bufferreader = new BufferedReader(new FileReader(fileName1))) {

            while ((str = bufferreader.readLine()) != null) {
                String key = str.split(" ")[0];
                Double value = Double.parseDouble(str.split(" ")[1]);

                if(treeMap.containsKey(key))
                {
                    value = treeMap.get(key).doubleValue()+ value;
                    treeMap.put(key,value);
                }
                else treeMap.put(key,value);
            }

            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
