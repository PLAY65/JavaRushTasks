package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {

        String fileName = "c:/11/text.txt";
        PersonScanner personScanner  = new PersonScannerAdapter(new Scanner(new File(fileName)));

        Person p1 = personScanner.read();
        Person p2 = personScanner.read();
        System.out.println(p1);
        System.out.println(p2);
        personScanner.close();
    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner){
           this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            String[] pers = fileScanner.nextLine().split(" ", 4); //парсит строку с разбивкой на 4 части
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d M y", Locale.ENGLISH);

            return new Person(pers[1], pers[2], pers[0], simpleDateFormat.parse(pers[3]));
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
