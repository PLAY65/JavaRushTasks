package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {

        String filename1= args[0];
        //String filename1 = "c:/11/text1.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename1))){

            String data;
            while ((data = reader.readLine())!= null){

                String name = data.replaceAll("\\d+", "").trim();
                String[] numbers = data.replaceAll(name, "").trim().split(" ");
                String date = numbers[0] + "/" + numbers[1] + "/" + numbers[2];
                PEOPLE.add(new Person(name.toString(), new SimpleDateFormat("dd/MM/yyyy").parse(date)));
            }
        }
    }
}
