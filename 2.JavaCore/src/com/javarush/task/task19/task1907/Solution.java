package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        reader.close();

        //String fileName = "C:/11/text1.txt";

        try(FileReader fileReader = new FileReader(fileName)){
            StringBuilder stringBuilder = new StringBuilder();

            String line;

            while (fileReader.ready()){
                stringBuilder.append((char) fileReader.read());
            }

            //System.out.println(new StringTokenizer(stringBuilder.toString(),"world").countTokens()-1);

            Pattern pattern = Pattern.compile("\\bworld\\b");
            Matcher matcher = pattern.matcher(stringBuilder.toString());
            int count = 0;
            while (matcher.find())
                count++;
            System.out.println(count);

        }
    }
}
