package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        //String fileName = "c:\\11\\result.txt";
        int count = 0;


        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            ArrayList<String> list = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                {
                    list.add(line);
                }
            }
            for (String str: list) {
                    Pattern pattern = Pattern.compile("[a-zA-Z]");
                    Matcher matcher = pattern.matcher(str);
                    while (matcher.find()) {
                        count++;
                    }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
