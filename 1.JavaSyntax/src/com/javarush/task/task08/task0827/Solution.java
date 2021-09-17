package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        int dayOfYear = 0;

        try {
            Date date1=new SimpleDateFormat("MMMM d yyyy").parse(date);

            //int a = date1.getDay();
            Calendar c = Calendar.getInstance();
            c.setTime(date1);

            dayOfYear = c.get(Calendar.DAY_OF_YEAR);
            System.out.println();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(dayOfYear%2==1) return true;
        else return false;

    }
}
