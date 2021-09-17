package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        reader.close();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))){
            String line;
            List<String> stringList = new ArrayList<>();

            while ((line = bufferedReader.readLine())!=null){
                for (Map.Entry<Integer, String> entry: map.entrySet()) {
                    line = line.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                stringList.add(line);
            }
            for (String a :stringList) {
                System.out.println(a);
            }
        }
    }
}
