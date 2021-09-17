package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        /*String fileName1 = "c:\\11\\file1.txt";
        String fileName2 = "c:\\11\\file2.txt";
        String fileName3 = "c:\\11\\file3.txt";*/

        /*FileWriter writer = new FileWriter(fileName1);
        FileReader reader2 = new FileReader(fileName2);
        FileReader reader3 = new FileReader(fileName3);*/


        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        int i;
        while((i=fileInputStream2.read())!= -1){
            fileOutputStream1.write(i);
        }
        //fileOutputStream1.write('\n');
        while((i=fileInputStream3.read())!= -1){
            fileOutputStream1.write(i);
        }
        //fileOutputStream1.write('\n');

        reader.close();
        fileOutputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
