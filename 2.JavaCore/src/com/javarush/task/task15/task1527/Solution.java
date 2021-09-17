package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        //String line = "http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        //String line = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo";
        if(!line.contains("obj"))
        {
            StringBuilder string = new StringBuilder();
            String lines = line.split("\\?",2)[1];
            String[] newLines = lines.split("&",5);
            for (int i = 0; i < newLines.length; i++) {
                if(newLines[i].contains("="))
                    string.append(newLines[i].split("=")[0]+" ");
                else string.append(newLines[i]+" ");
            }
            System.out.println(string.toString().trim());
        }
        else {
            StringBuilder string = new StringBuilder();
            String lines = line.split("\\?",2)[1];
            String[] newLines = lines.split("&",5);
            String temp = null;
            for (int i = 0; i < newLines.length; i++) {
                if(newLines[i].contains("="))
                    string.append(newLines[i].split("=")[0]+" ");
                    if(i==0)
                    {
                        temp = newLines[i].split("=")[1];
                        System.out.println();
                    }
            }
            System.out.println(string.toString().trim());

            try {
                alert(Double.parseDouble(temp));
            } catch (NumberFormatException e) {
                alert(temp);
            }

            System.out.println();
        }



    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
