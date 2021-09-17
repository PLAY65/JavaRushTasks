package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Enter date from keyboard
        //String a = "2013-08-18";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(a);

        SimpleDateFormat newFormatter = new SimpleDateFormat("MMM dd, yyyy"); //AUG 18, 2013
        System.out.println(newFormatter.format(date).toUpperCase());
    }
}
