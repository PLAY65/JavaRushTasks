package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> kchilds=new ArrayList<Human>();

        Human r1  = new Human("r1",true,5,kchilds);
        Human r2  = new Human("r2",true,6,kchilds);
        Human r3  = new Human("r3",true,7,kchilds);
        ArrayList<Human> FMchilds=new ArrayList<Human>();
        FMchilds.add(r1);
        FMchilds.add(r2);
        FMchilds.add(r3);

        Human o1  = new Human("o1",true,25,FMchilds);
        Human m1  = new Human("m1",false,25,FMchilds);
        ArrayList<Human> parents1=new ArrayList<Human>();
        parents1.add(o1);

        ArrayList<Human> parents2=new ArrayList<Human>();
        parents2.add(m1);

        Human d1  = new Human("d1",true,75,parents1);
        Human b1  = new Human("b1",false,75,parents1);
        Human d2  = new Human("d2",true,75,parents2);
        Human b2  = new Human("b2",false,75,parents2);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(o1.toString());
        System.out.println(m1.toString());
        System.out.println(d1.toString());
        System.out.println(b1.toString());
        System.out.println(d2.toString());
        System.out.println(b2.toString());
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
           this.name = name;
           this.sex = sex;
           this.age = age;
            this.children=children;
            //Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
