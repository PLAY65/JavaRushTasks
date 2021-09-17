package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> stringCatMap = new HashMap<String, Cat>();
        stringCatMap.put("name1", new Cat("cat1"));
        stringCatMap.put("name2", new Cat("cat2"));
        stringCatMap.put("name3", new Cat("cat3"));
        stringCatMap.put("name4", new Cat("cat4"));
        stringCatMap.put("name5", new Cat("cat5"));
        stringCatMap.put("name6", new Cat("cat6"));
        stringCatMap.put("name7", new Cat("cat7"));
        stringCatMap.put("name8", new Cat("cat8"));
        stringCatMap.put("name9", new Cat("cat9"));
        stringCatMap.put("name10", new Cat("cat10"));

        return stringCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>(map.values());

        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
