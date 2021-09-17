package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("роза");
//        strings.add("лоза");
//        strings.add("лира");

        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        ArrayList<String> strings1  = new ArrayList<>();

        for (String a :strings) {
            if (a.contains("р") && !a.contains("л"))
            {
                continue;
            }
            else if (!a.contains("р") && a.contains("л")){
               strings1.add(a);
               strings1.add(a);
               continue;
            }else {
                strings1.add(a);
                continue;
            }
            
        }/*
        //int length = strings.size();
        for (int i = 0; i < strings.size()-1; i++) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л"))
            {
                strings.remove(i);
                if(i>0) i-=1;
                else i=0;
                continue;
            }
            if (!strings.get(i).contains("р") && strings.get(i).contains("л"))
            {
                strings.add(i,strings.get(i));
                i+=1;
                continue;
            }
        }s
*/

        return strings1;
    }
}