package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //String filename = "c:\\11\\a.txt";

        FileInputStream inputStream = new FileInputStream(filename);
        int count = 0;

        while (inputStream.available() > 0){

            if(inputStream.read() == 44){
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
