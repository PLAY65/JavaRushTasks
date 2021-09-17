package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        /*String fileName1 = "C:/11/text1.txt";
        String fileName2 = "C:/11/text2.txt";*/

        try(FileReader fileReader = new FileReader(fileName1)){
            try (FileWriter fileWriter = new FileWriter(fileName2)){

                int i,count = 0;
                while ((i=fileReader.read())!=-1){
                    count++;
                    if(count%2==0){
                        fileWriter.write((char)i);
                    }
                }
            }
        }
    }
}
