package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.

Пример
getTokens("level22.lesson13.task01", ".")

возвращает массив строк
{"level22", "lesson13", "task01"}


Requirements:
1. Метод getTokens должен использовать StringTokenizer.
2. Метод getTokens должен быть публичным.
3. Метод getTokens должен принимать два параметра типа String.
4. Массив типа String возвращенный методом getTokens должен быть заполнен правильно(согласно условию задачи).
*/

public class Solution {
    public static void main(String[] args) {

        String[] str = getTokens("level22.lesson13.task01", ".");
    }

    public static String[] getTokens(String query, String delimiter) {
        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreElements()) {
            tokens.add(tokenizer.nextToken());
        }

        String[] temp = new String[tokens.size()];
        for (int j = 0; j < tokens.size(); j++) {
            temp[j] = tokens.get(j);
        }
        return temp;
    }
}
