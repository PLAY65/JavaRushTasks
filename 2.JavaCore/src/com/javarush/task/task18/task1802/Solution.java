package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //String filename = "c:\\11\\a.txt";
        reader.close();

        FileInputStream reader1 = new FileInputStream(filename);
        int min = reader1.read();
        while (reader1.available() >0){
            int temp = reader1.read();
            if(temp < min)
            {
                min =temp;
            }
        }
        reader1.close();
        System.out.println(min);

    }
}
