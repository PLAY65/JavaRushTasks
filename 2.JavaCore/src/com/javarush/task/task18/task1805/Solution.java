package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Сортировка байт
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

        Collections.sort(arrayList);

        ArrayList<Integer> listUnique = (ArrayList<Integer>) arrayList.stream().distinct().collect(Collectors.toList());
        /*HashSet<Integer> hSetNumbers = new HashSet(arrayList);
        for (Integer number: hSetNumbers) {
            System.out.print(number + " ");
        }*/

        for (Integer number: listUnique) {
            System.out.print(number + " ");
        }

    }

}
