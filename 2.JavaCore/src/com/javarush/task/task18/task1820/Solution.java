package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        /*String fileName1 = "c:\\11\\num1.txt";
        String fileName2 = "c:\\11\\num2.txt";*/

        List<Float> floatList = new ArrayList<>();

        try (BufferedReader fileReader1 = new BufferedReader(new FileReader(fileName1))){
            String line;
            while ((line = fileReader1.readLine()) != null) {
                String[] splited = line.split("\\s+");
                for (String str : splited) {

                    float num = Float.parseFloat(str);
                    floatList.add(num);
                }

            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))){

            for (Float num: floatList) {
                int numStr = Math.round(num);
                writer.write(numStr+ " ");
            }
        }
    }
}
