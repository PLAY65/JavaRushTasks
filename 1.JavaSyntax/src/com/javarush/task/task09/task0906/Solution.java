package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String text) {
        StackTraceElement[] var = Thread.currentThread().getStackTrace();
        System.out.println(var[2].getClassName() + ": " + var[2].getMethodName() + ":  " + text);
    }
}
