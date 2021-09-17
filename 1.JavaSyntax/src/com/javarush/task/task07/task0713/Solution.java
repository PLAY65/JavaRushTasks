package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer chislo: mainList) {
            if(chislo%3==0) firstList.add(chislo);
            if (chislo%2==0) secondList.add(chislo);
            if (chislo%3!=0 && chislo%2!=0) thirdList.add(chislo);
        }
        printList(firstList);
        printList(secondList);
        printList(thirdList);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i: list) {
            System.out.println(i);
        }

    }
}
