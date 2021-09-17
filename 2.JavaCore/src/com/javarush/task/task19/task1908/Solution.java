package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

       /* String fileName1 = "C:/11/text1.txt";
        String fileName2 = "C:/11/text2.txt";*/

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            StringBuilder stringBuilder = new StringBuilder();

            while (fileReader.ready()) {
                stringBuilder.append((char) fileReader.read());
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
                String[] strings = stringBuilder.toString().split(" ");

                for (String str: strings) {
                    if(str.chars().allMatch(Character::isDigit)){
                        bufferedWriter.write(str+" ");
                    }
                }
            }
        }
    }
}
