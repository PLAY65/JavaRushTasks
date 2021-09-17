package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("1","11");
        stringMap.put("2","2");
        stringMap.put("3","33");
        stringMap.put("4","44");
        stringMap.put("5","55");
        stringMap.put("6","66");
        stringMap.put("7","77");
        stringMap.put("8","88");
        stringMap.put("9","99");
        stringMap.put("10","1010");

        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count=0;
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(entry.getValue().equals(name)) count++;
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(entry.getKey().equals(lastName)) count++;
        }

        return count;

    }

    public static void main(String[] args) {

    }
}
