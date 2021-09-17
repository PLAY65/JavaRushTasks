package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        /*String fileName1 = "c:\\11\\file1.txt";
        String fileName2 = "c:\\11\\file2.txt";*/


        List<String> list = new ArrayList<>();
        try (BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1))){
            String line;
            while ((line = fileReader1.readLine()) != null) {
                list.add(line);
            }
        }
        try (BufferedReader fileReader2 = new BufferedReader(new FileReader(fileName2))){
            String line;

            try (FileOutputStream fos = new FileOutputStream(fileName1)) {

                while ((line = fileReader2.readLine()) != null) {
                    fos.write(line.getBytes());
                }
                for (String str: list) {
                    fos.write(str.getBytes());
                }
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
