package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("A",1,"addr");
        Man man2 = new Man("A",1,"addr");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman wom1 = new Woman("A",1,"addr");
        Woman wom2 = new Woman("A",1,"addr");
        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
        System.out.println(wom1.name + " " + wom1.age + " " + wom1.address);
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){

            this.name = name;
            this.age = age;
            this.address = address;

        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){

            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
