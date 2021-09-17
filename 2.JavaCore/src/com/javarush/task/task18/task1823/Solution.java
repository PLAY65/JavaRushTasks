package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        while (!(filename = reader.readLine()).equals("exit")){
            Thread thread = new ReadThread(filename);
            thread.start();
        }
    }

    public static class ReadThread extends Thread {

        private String filename;

        public ReadThread(String fileName) {
            this.filename=fileName;
        }

        @Override
        public void run(){
            System.out.println(filename);

            int[] bytes = new int[256];
            try {
                FileInputStream fis = new FileInputStream(filename);
                byte b;
                while ((b = (byte) fis.read())!=-1) {
                    bytes[b]++;
                }
                fis.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            int max = 0, index =0;
            for (int i = 0; i < bytes.length; i++) {
                if(max<bytes[i]){
                    max=bytes[i];
                    index = i;
                }
            }

            synchronized (resultMap){
                resultMap.put(filename,index);
            }
        }
    }
}
