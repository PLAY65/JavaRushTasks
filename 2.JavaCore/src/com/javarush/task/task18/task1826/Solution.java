package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);

        if(args[0]=="-e"){
            int i;
            //while((i=fileInputStream.read())!= -1){
            while((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i*2);
            }
        }else if(args[0]=="-d"){
            int i;
            //while((i=fileInputStream.read())!= -1){
            while((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i/2);
            }
        }
                fileInputStream.close();
                fileOutputStream.close();
    }

}
