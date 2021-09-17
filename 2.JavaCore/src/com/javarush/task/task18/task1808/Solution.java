package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        reader.close();
//        String filename1 = "c:\\11\\1.txt";
//        String filename2 = "c:\\11\\2.txt";
//        String filename3 = "c:\\11\\3.txt";

        FileInputStream file1 = new FileInputStream(filename1);

        FileOutputStream file2 = new FileOutputStream(filename2);
        FileOutputStream file3 = new FileOutputStream(filename3);

        int halfBytes = file1.available() / 2 + file1.available() % 2;
        byte[] partOne = new byte[halfBytes];
        byte[] partTwo = new byte[file1.available() - halfBytes];

        file1.read(partOne);
        file1.read(partTwo);

        file2.write(partOne);
        file3.write(partTwo);

        file1.close();
        file2.close();
        file3.close();

    }
}
