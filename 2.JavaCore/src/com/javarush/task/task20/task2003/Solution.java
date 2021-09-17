package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();
    public static Properties prop = new Properties();

    public static void save(OutputStream outputStream) throws Exception {
        prop.clear();
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()) {
            prop.put (pair.getKey(), pair.getValue());
        }
        prop.store(outputStream,"");
    }

    public static void load(InputStream inputStream) throws IOException {
        prop.clear();
        prop.load(inputStream);
        for (String key : prop.stringPropertyNames()) {
            runtimeStorage.put(key, prop.get(key).toString());
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
