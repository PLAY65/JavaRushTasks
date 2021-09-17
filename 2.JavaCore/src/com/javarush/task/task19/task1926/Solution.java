package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        reader.close();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))){
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(new StringBuilder(line).reverse());
            }
        }
    }
}
