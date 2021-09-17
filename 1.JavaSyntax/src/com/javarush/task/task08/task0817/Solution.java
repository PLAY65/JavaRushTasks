package com.javarush.task.task08.task0817;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("1", "Андрей");
        stringMap.put("2", "Андрей");
        stringMap.put("3", "Андрей");
        stringMap.put("4", "Сергей");
        stringMap.put("5", "Сергей");
        stringMap.put("6", "Андрей");
        stringMap.put("7", "Андрей");
        stringMap.put("8", "Вася");
        stringMap.put("9", "Женя");
        stringMap.put("10", "Андрей");
        return stringMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        for (String str : copy.values()) {
            int count = 0;
            for (String name : map.values()) {
                if (name.equals(str)) {
                    count++;
                }
            }
                if (count>1)
                {
                    removeItemFromMapByValue(map,str);
                }
            }
        }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
