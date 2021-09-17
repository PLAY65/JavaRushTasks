package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (50 <= number && 100 >= number)
            System.out.println("Число "+number+" содержится в интервале.");
        else System.out.println("Число "+number+" не содержится в интервале.");

    }
}