package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //-c productName price quantity
//        -c - флаг, который означает добавления товара.
//        productName - название товара, 30 символов.
//        price - цена, 8 символов.
//        quantity - количество, 4 символа.

        //args = new String[4];
       /* args[0] = "-c";
        args[1] = "Шорты";
        args[2] = "161.00";
        args[3] = "12";*/


        //-c productName price quantity

        BufferedReader readerFilename = new BufferedReader(new InputStreamReader(System.in));
        //String filename = readerFilename.readLine();
        String filename = "c:\\11\\1.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        if (args.length == 4 && args[0].equals("-c")){

            int id,max = 0;
            while (reader.ready()){
                id = Integer.parseInt(reader.readLine().substring(0,8).trim());
                if(id > max) {
                    max = id;
                }
            }
            writer.write(String.format("\n%-8.8s%-30.30s%-8.8s%-4.4s", max + 1, args[1], Float.parseFloat(args[2]), Integer.parseInt(args[3])));
            //writer.write(String.format("\n%-8s%-30s%-8s%-4s", max + 1, args[1], Float.parseFloat(args[2]), Integer.parseInt(args[3])));
        }

        readerFilename.close();
        writer.close();
        reader.close();


    }
}
