package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String file1 = reader.readLine();
         String file2 = reader.readLine();
       //String file1 = "c:\\11\\a.txt";
        //String file2 = "c:\\11\\b.txt";
        StringBuilder contentBuilder = new StringBuilder();
        //first file
        try (BufferedReader br = new BufferedReader(new FileReader(file1))){
            String currentLine;

            while ((currentLine = br.readLine()) != null){
                allLines.add(currentLine);
            }
        }
        //second file
        try (BufferedReader br = new BufferedReader(new FileReader(file2))){
            String currentLine;

            while ((currentLine = br.readLine()) != null){
                forRemoveLines.add(currentLine);
            }
        }

       new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if( allLines.containsAll(forRemoveLines) ) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
