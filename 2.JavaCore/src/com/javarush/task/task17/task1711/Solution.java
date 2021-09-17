package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        //args = new String[] {"-c", "Василий", "м", "15/04/1990", "Алена", "ж", "08/05/1996"};
        //args = new String[] {"-u", "0", "Александр", "м", "21/07/1987", "1", "Елена", "ж", "08/09/1993"};
        //args = new String[] {"-d", "0", "1"};
        //args = new String[] {"-i", "0", "1"};

        /*String key = null;
        if (!args[0].isEmpty()) {
            key = args[0];
        }*/
        switch (args[0]) {
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i <args.length; i+=3)
                    {
                        try {
                            if (args[i+1] == "м") {
                                allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2])));
                            } else {
                                allPeople.add(Person.createFemale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2])));
                            }
                            System.out.println(allPeople.size() - 1);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
            }

            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i <args.length; i+=4)
                    {
                        allPeople.get(Integer.parseInt(args[i])).setName(args[i+1]);
                        if (args[i+2] == "м") {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.MALE);
                        } else {
                            allPeople.get(Integer.parseInt(args[i])).setSex(Sex.FEMALE);
                        }
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+3]));
                    }
                    break;
                }
            }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i <args.length; i++) {
                        allPeople.get(Integer.parseInt(args[i])).setName(null);
                        allPeople.get(Integer.parseInt(args[i])).setSex(null);
                        allPeople.get(Integer.parseInt(args[i])).setBirthDate(null);
                    }
                    break;
                }
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i <args.length; i++) {
                        System.out.print(allPeople.get(Integer.parseInt(args[i])).getName() + " ");
                        if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)) {
                            System.out.print("м ");
                        } else {
                            System.out.print("ж ");
                        }
                        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        System.out.println(dateFormat.format(allPeople.get(Integer.parseInt(args[i])).getBirthDate()));
                    }
                    break;
                }

            }
        }
    }
}
