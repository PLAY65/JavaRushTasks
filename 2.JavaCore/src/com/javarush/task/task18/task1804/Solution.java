package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //String filename = "c:\\11\\a.txt";

        ArrayList<Integer> arrayList = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(filename);

        while (inputStream.available()>0){
            arrayList.add(inputStream.read());
        }
        inputStream.close();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arrayList) {
            map.put(i,Collections.frequency(arrayList,i));
        }

        int min = Collections.min(map.values());

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue().equals(min)){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
