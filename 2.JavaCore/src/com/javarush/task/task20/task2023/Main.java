package com.javarush.task.task20.task2023;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Collection c = new HashSet();
        print(c);
    }

    public static void print(Collection c){
        System.out.println("Collection");
    }

    public static void print(Set s){
        System.out.println("Set");
    }

    public static void print(HashSet s){
        System.out.println("HashSet");
    }
}
