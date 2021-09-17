package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        /*String fileName1 = "C:/11/text1.txt";
        String fileName2 = "C:/11/text2.txt";*/

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1))){
            StringBuilder stringBuilder = new StringBuilder();

            while (bufferedReader1.ready()){
                stringBuilder.append((char) bufferedReader1.read());
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){

                bufferedWriter.write(stringBuilder.toString().replaceAll("\\p{Punct}","").replaceAll("\n",""));
            }

        }

    }
}
