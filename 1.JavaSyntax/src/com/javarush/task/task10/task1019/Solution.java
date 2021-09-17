package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id = 0;
        String name;
        while(true){
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            name = reader.readLine();
            if (name==null) break;
            if (name == ""){
                map.put(name,id);
                break;
            }
            map.put(name,id);
        }

        map.forEach((a,b) -> System.out.println(b + " " + a));

    }
}
