package com.javarush.task.task08.task0818;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("A1",501);
        map.put("A2",501);
        map.put("A3",501);
        map.put("A4",401);
        map.put("A5",401);
        map.put("A6",401);
        map.put("A7",401);
        map.put("A8",601);
        map.put("A9",401);
        map.put("A10",401);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue()<500) iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}