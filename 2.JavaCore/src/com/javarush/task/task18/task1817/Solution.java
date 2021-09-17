package com.javarush.task.task18.task1817;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) {

        String fileName = args[0];
        int countSymbols = 0;
        int countSpaces = 0;


        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            ArrayList<String> list = new ArrayList<>();
            while ((line = fileReader.readLine()) != null) {
                {
                    list.add(line);
                }
            }
            for (String str : list) {
                for (int i = 0; i< str.length() ; i++) {
                    if(str.charAt(i) != ' ')
                        countSymbols++;
                    else countSpaces++;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        float result = (float) countSpaces/countSymbols*100;

        /*System.out.println(countSymbols);
        System.out.println(countSpaces);
        System.out.println(result);*/
        System.out.println(String.format("%.2f", result));
        //System.out.println(new DecimalFormat("##.##").format(result));




    }
}
