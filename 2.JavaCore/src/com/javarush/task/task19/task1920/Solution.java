package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            args = new String[]{"c:/11/text1.txt"};
        }
        String fileName1 = args[0];

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

            double max = 0.0;
            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                
                if(entry.getValue()>max){
                    max = entry.getValue();
                }
            }

            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                if(entry.getValue().equals(max)){
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
