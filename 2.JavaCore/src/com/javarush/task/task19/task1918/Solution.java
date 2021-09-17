package com.javarush.task.task19.task1918;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {


       /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       //String fileName1 = reader.readLine();
       String fileName1 = "c:/11/text1.html";
       reader.close();*/


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))){
            StringBuilder text = new StringBuilder();
            while (fileReader.ready()) text.append(fileReader.readLine()).append('\n');

            Document doc = Jsoup.parse(text.toString(),"", Parser.xmlParser());
            Elements elements = doc.select(args[0]);
            for (Element oneTag : elements)
                System.out.println(oneTag.outerHtml());
        } catch (IOException e) {
        }

    }
}
