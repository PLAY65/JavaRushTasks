package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        InputStream inputStream = new FileInputStream(nameFile);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (bufferedReader.ready()){
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        Collections.sort(arrayList);

        for (Integer num: arrayList) {
            if(num%2==0) System.out.println(num);
        }
        inputStream.close();
        reader.close();
        bufferedReader.close();
    }
}
