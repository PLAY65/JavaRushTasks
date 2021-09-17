package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        return (double)earthWeight / 100.0 *17.0;
        //return a;
    }
}