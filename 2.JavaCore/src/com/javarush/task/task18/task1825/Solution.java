package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = reader.readLine()).equals("end")){
            arrayList.add(fileName);
        }
        reader.close();

        Collections.sort(arrayList);

        //String commonFile = arrayList.get(0).replaceFirst("[.][^.]+$", "");
        String commonFile = arrayList.get(0).substring(0, arrayList.get(0).lastIndexOf("."));

        try(FileOutputStream outputStream = new FileOutputStream(commonFile)){

            for (String file: arrayList) {
                FileInputStream inputStream = new FileInputStream(file);
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                outputStream.write(buffer,0,count);
                inputStream.close();
            }
        }
    }
}
