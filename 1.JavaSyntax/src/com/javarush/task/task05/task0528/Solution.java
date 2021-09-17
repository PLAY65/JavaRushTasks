package com.javarush.task.task05.task0528;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {

        Date currentDate = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd MM yyyy");
        String dateOnly = dateFormat.format(currentDate);
        System.out.println(dateOnly);

    }
}
