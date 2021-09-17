package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String nameFile = reader.readLine();

            InputStream inStream = new FileInputStream(nameFile);
            BufferedReader bif = new BufferedReader(new InputStreamReader(inStream));


            while (bif.ready())
            {
                System.out.println(bif.readLine());
            }

            inStream.close();
            bif.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}