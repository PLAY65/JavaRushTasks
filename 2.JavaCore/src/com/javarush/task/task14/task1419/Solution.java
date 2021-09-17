package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception

        //1. java.lang.ArithmeticException: / by zero
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //2. java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1
        try {
            int c[] = { 1 };
            c[4] = 33;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //3. java.lang.NullPointerException
        try {
            Solution solution = null;
            solution.equals("");

        } catch (Exception e) {
            exceptions.add(e);
        }

        //4. RuntimeException
        try {
            throw new RuntimeException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //5. IllegalArgumentException
        try {
            throw new IllegalArgumentException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //6. IllegalAccessException
        try {
            throw new IllegalAccessException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //6. IOException
        try {
            throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }

     /*   //7. InterruptedIOException
        try {
            throw new InterruptedIOException();

        } catch (Exception e) {
            exceptions.add(e);
        }*/

        //8. IllegalThreadStateException
        try {
            throw new IllegalThreadStateException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //9. InstantiationException
        try {
            throw new InstantiationException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        //10. InputMismatchException
        try {
            throw new InputMismatchException();

        } catch (Exception e) {
            exceptions.add(e);
        }

    }
}
