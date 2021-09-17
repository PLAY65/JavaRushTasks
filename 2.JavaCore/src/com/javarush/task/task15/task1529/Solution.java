package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String flyObject = reader.readLine();

        if (flyObject.equals("helicopter")) result = new Helicopter();
        if (flyObject.equals("plane")) {
            int passengers = Integer.parseInt(reader.readLine());
            result = new Plane(passengers);
        }
        /*switch (flyObject) {
            case ("helicopter") :
                result = new Helicopter();
                break;
            case ("plane") :
                int passengers = Integer.parseInt(reader.readLine());
                result = new Plane(passengers);
                break;*/
        reader.close();
    }
}
