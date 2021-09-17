package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов1", dateFormat.parse("MAY 2 2012"));
        map.put("Смирнов2", dateFormat.parse("MAY 3 2012"));
        map.put("Смирнов3", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов4", dateFormat.parse("JULY 1 2012"));
        map.put("Смирнов5", dateFormat.parse("AUGUST 1 2012"));
        map.put("Смирнов6", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов7", dateFormat.parse("MAY 1 2012"));
        map.put("Смирнов8", dateFormat.parse("JUNE 1 2012"));
        map.put("Смирнов9", dateFormat.parse("MAY 1 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        Calendar cal  = Calendar.getInstance();

        while (iterator.hasNext()){
            Map.Entry<String,Date> entry = iterator.next();
            cal.setTime(entry.getValue());
            int month  = cal.get(Calendar.MONTH);
            if(month>=5 && month<=7) iterator.remove();
        }
    }

    public static void main(String[] args) {
    }
}
