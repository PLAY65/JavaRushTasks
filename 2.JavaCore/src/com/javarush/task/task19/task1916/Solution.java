package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

       /* String fileName1 = "c:/11/text1.txt";
        String fileName2 = "c:/11/text2.txt";*/

        reader.close();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        String str;
        try (BufferedReader bufferreader = new BufferedReader(new FileReader(fileName1))) {
            while ((str = bufferreader.readLine()) != null) {
                list1.add(str.trim());
            }
        }
        try (BufferedReader bufferreader = new BufferedReader(new FileReader(fileName2))) {
            while ((str = bufferreader.readLine()) != null) {
                list2.add(str.trim());
            }
        }
        System.out.println();

        while (!list1.isEmpty() && !list2.isEmpty()){
            if(list1.get(0).equals(list2.get(0))){
                lines.add(new LineItem(Type.SAME,list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            }else if(list1.get(1).equals(list2.get(0))){
                lines.add(new LineItem(Type.REMOVED,list1.get(0)));
                list1.remove(0);
            }else {
                lines.add(new LineItem(Type.ADDED,list2.get(0)));
                list2.remove(0);
            }

        }
        if (list1.isEmpty()){
            while (!list2.isEmpty()){
                lines.add(new LineItem(Type.ADDED,list2.get(0)));
                list2.remove(0);
            }
        }
        else {
            while (!list1.isEmpty()){
                lines.add(new LineItem(Type.REMOVED,list1.get(0)));
                list1.remove(0);
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
