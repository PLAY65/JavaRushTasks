package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName1 = args[0];
        String fileName2 = args[1];
        List<String> stringList = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1))){
            String line;
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))){
                while ((line = reader.readLine())!=null){
                    Arrays.stream(line.split(" ")).filter((st) -> st.length()>6).forEach(stringList::add);
                }
                String result = String.join(",",stringList);
                writer.write(result);
            }
        }
    }
}
