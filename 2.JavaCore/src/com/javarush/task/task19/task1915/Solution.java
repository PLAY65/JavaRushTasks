package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = bufferedReader.readLine();
        //String fileName1 = "c:/11/text1.txt";

        bufferedReader.close();

        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        PrintStream stream = new PrintStream(outputStream);

        System.setOut(stream);

        testString.printSomething();

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        System.setOut(consoleStream);
        System.out.println(outputStream);
        fileOutputStream.write(outputStream.toByteArray());

        fileOutputStream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

