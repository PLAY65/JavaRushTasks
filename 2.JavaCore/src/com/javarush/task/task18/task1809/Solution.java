package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        reader.close();
//        String filename1 = "c:\\11\\1.txt";
//        String filename2 = "c:\\11\\2.txt";

        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);

        byte[] bytes = new byte[file1.available()];


        file1.read(bytes);

        for (int i = bytes.length-1; i > -1; i--) {

            file2.write(bytes[i]);
        }


        file1.close();
        file2.close();
    }
}

