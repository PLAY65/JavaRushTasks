package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String id = args[0];

        /*String fileName = "c:\\11\\text.txt";
        String id = "195";*/

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = fileReader.readLine())!= null){
                if(line.startsWith(id+" "))
                    System.out.println(line);
            }
        }
    }
}
