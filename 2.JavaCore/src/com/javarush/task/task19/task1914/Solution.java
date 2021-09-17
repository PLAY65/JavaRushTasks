package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        System.out.print(result);
        switch (result.split(" ")[1]){
            case "+":
                System.out.println(Integer.parseInt(result.split(" ")[0]) + Integer.parseInt(result.split(" ")[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(result.split(" ")[0]) - Integer.parseInt(result.split(" ")[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(result.split(" ")[0]) * Integer.parseInt(result.split(" ")[2]));
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

