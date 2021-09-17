package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //args = new String[] {"-c", "Василий", "м", "15/04/1990"};
        //args = new String[] {"-u", "1", "Елена", "ж", "08/09/1993"};
        //args = new String[] {"-d", "0"};
        //args = new String[]{"-i", "1"};
        String key = null;
        if (!args[0].isEmpty()) {
            key = args[0];
        }
        switch (key) {
            case "-c": {
                int index = 0;
                try {
                    if (args[2] == "м") {
                        allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));
                    } else {
                        allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[3])));
                    }
                    System.out.println(allPeople.size() - 1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            }

            case "-u": {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3] == "м") {
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                } else {
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                }
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(args[4]));
                break;
            }
            case "-d":
                allPeople.get(Integer.parseInt(args[1])).setName(null);
                allPeople.get(Integer.parseInt(args[1])).setSex(null);
                allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
                break;
            case "-i": {
                System.out.print(allPeople.get(Integer.parseInt(args[1])).getName() + " ");
                if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE)) {
                    System.out.print("м ");
                } else {
                    System.out.print("ж ");
                }
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
                System.out.print(dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate()));
                break;
            }
        }
    }
}
