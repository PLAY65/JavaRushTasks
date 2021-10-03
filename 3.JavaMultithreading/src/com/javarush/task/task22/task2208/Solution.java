package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Requirements:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/

public class Solution {
    public static void main(String[] args) {

        Map<String,String> params = new LinkedHashMap<>();
        params.put("name","Ivanov");
        params.put("country","Ukraine");
        params.put("city","Kiev");
        params.put("age",null);

        String result = getQuery(params);
    }

    public static String getQuery(Map<String, String> params) {

        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> mapEntry: params.entrySet()) {
            if (mapEntry.getValue()!=null && mapEntry.getKey()!=null){
                result.append(mapEntry.getKey() + " " + "=" + " " + "'" + mapEntry.getValue() + "'"+ " and ");
            }
        }
        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}
