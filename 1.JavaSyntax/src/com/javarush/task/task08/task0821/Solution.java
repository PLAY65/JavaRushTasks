package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Кардаш","Сергей1");
        stringMap.put("Кардаш","Сергей2");
        stringMap.put("Кардаш","Сергей3");
        stringMap.put("Кардаш","Сергей4");
        stringMap.put("Кардаш","Сергей5");
        stringMap.put("Кардаш1","Сергей");
        stringMap.put("Кардаш2","Сергей");
        stringMap.put("Кардаш3","Сергей");
        stringMap.put("Кардаш4","Сергей");
        stringMap.put("Кардаш5","Сергей");

        return stringMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
