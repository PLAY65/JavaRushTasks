package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // read file name
        String fileName = reader.readLine();

        String test;
        BufferedWriter bfw = new BufferedWriter(new FileWriter(fileName));

            do{ test = reader.readLine();
                bfw.write(test);
                bfw.newLine();
            }while (!test.equals("exit"));

        bfw.close();
        reader.close();

    }
}
