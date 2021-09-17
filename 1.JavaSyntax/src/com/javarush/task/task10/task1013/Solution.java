package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private String city;
        private Date birthdate;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, String surname){
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age){
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, boolean sex){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex, String city){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.city = city;
        }

        public Human(String name, String surname, int age, boolean sex, String city, Date birthdate){
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.birthdate = birthdate;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }
    }
}
