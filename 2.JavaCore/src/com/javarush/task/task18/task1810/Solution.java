package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream file1;

            while (true) {
                file1 = new FileInputStream(reader.readLine());
                if (file1.available()<1000) {
                    file1.close();
                    throw new DownloadException();
                }
            }
    }

    public static class DownloadException extends Exception {

    }
}
