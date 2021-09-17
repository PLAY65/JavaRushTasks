package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String fileName1 = args[0];
        String fileName2 = args[1];

        reader.close();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))){
            try (FileWriter fileWriter = new FileWriter(fileName2)){
            String line;
            while ((line = bufferedReader.readLine())!=null){

                    Pattern regex = Pattern.compile("\\S*\\d+\\S*");
                    Matcher regexMatcher = regex.matcher(line);

                while (regexMatcher.find()) {
                        fileWriter.write(regexMatcher.group() + " ");
                    }
                }
            }
        }
    }
}
