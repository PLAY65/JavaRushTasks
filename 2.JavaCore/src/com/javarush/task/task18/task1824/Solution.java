package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            FileInputStream reader1 = null;
            String fileName = null;

            try {
                while ((fileName = reader.readLine()) != null) {
                    reader1 = new FileInputStream(fileName);
                    reader1.close();
                }
            } catch (FileNotFoundException e) {
                //e.printStackTrace();
                System.out.println(fileName);
            }
            finally {
                if (reader != null)
                    reader.close();
                if (reader1 != null)
                    reader1.close();
            }
        }
    }
}