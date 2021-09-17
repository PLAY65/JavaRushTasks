package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();
        //String filename = "c:\\11\\a.txt";


        FileInputStream inputStream = new FileInputStream(filename);
        int max = 0;
        while (inputStream.available()>0){
            int temp = inputStream.read();
            if(temp> max) {
                max = temp;
            }
        }
        System.out.println(max);
        inputStream.close();

    }
}
