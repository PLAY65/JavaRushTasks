package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human o1 = new Human("o1",true,15);
        Human o2 = new Human("o2",true,15);
        Human o3 = new Human("o3",true,15);
        Human o4 = new Human("o4",true,15);

        Human o5 = new Human("o5",true,15,o1,o2);
        Human o6 = new Human("o6",true,15,o1,o2);
        Human o7 = new Human("o7",true,15,o1,o2);
        Human o8 = new Human("o8",true,15,o1,o2);
        Human o9 = new Human("o9",true,15,o1,o2);

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
        System.out.println(o6);
        System.out.println(o7);
        System.out.println(o8);
        System.out.println(o9);
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}