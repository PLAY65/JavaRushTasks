package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
Метод checkTelNumber должен проверять, является ли аргумент telNumber валидным номером телефона.

Критерии валидности:
1) если номер начинается с '+', то он содержит 12 цифр
2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
3) может содержать 1 пару скобок '(' и ')'
4) скобки (если они есть) внутри содержат четко 3 цифры
5) номер может содержать только цифры, '+', '(' и ')'
6) номер заканчивается на цифру

Примеры:
+380501234567 - true
+38(050)1234567 - true
(050)1234567 - true
0(501)234567 - true
+38)050(1234567 - false
+38(050)123-45-67 - false
050ххх4567 - false
050123456 - false
(0)501234567 - false


Requirements:
1. Метод checkTelNumber должен возвращать значение типа boolean.
2. Метод checkTelNumber должен быть публичным.
3. Метод checkTelNumber должен принимать один параметр типа String.
4. Метод checkTelNumber должен корректно проверять валидность номера телефона переданного ему в качестве параметра.
*/

/*
Для контроля количества цифр (12 с плюсом и 10 без него) использован Lookahead:
        (\+(?=(\D?\d){12}$)|(?=(\D?\d){10}$))
        Сразу после "+", если он есть, необязательное произвольное количество цифр: \d*
        Затем не обязательная скобочная группа в которой 3 цифры: (\(\d{3}\))?
        Далее не более двух групп из цифр и дефиса: (\d+-){0,2}
        В конце не менее одной цифры: \d+

        Правило более строгое чем перечисленные условия задачи,
        но допускает свободное перемещение скобочной группы и дефисов.
        Решения, которые увидел в комментариях с использованием
        одной регулярки накладывают еще более жесткие ограничения.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        if(telNumber==null)
            return false;

        int totalDigit = telNumber.replaceAll("\\D", "").length();
        if(telNumber.startsWith("+") && totalDigit!=12)
            return false;

        if (telNumber.replaceAll("[^0-9\\+\\(\\)]", "").length() != telNumber.length())
            return false;

        if (telNumber.startsWith("[0-9]\\(") && totalDigit != 10)
            return false;

        return telNumber.matches("^(\\+(?=(\\D?\\d){12}$)|(?=(\\D?\\d){10}$))\\d*(\\(\\d{3}\\))?(\\d+-){0,2}\\d+$");
    }

    public static void main(String[] args) {

        HashMap<String, Boolean> phones = new HashMap<>();
        phones.put("+380501234567",true);
        phones.put("+38(050)1234567",true);
        phones.put("(050)1234567",true);
        phones.put("0(501)234567",true);
        phones.put("+38)050(1234567",false);
        phones.put("050ххх4567",false);
        phones.put("050123456",false);
        phones.put("+38(050)123-45-67",false);
        phones.put("(0)501234567",false);

        for (Map.Entry<String,Boolean> pair: phones.entrySet()) {
            if(checkTelNumber(pair.getKey())!=pair.getValue()){
                System.out.println("Wrong:Should be:" + pair.getValue() + " checkTelNumber:" + checkTelNumber(pair.getKey()) + " " + pair.getKey());
            }
        }
    }
}
