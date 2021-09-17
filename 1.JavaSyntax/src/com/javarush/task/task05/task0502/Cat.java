package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if(this.age<anotherCat.age && this.weight<anotherCat.weight && this.strength<anotherCat.strength) return false;

        else if (this.age<anotherCat.age && this.weight==anotherCat.weight && this.strength==anotherCat.strength) return false;
        else if (this.weight<anotherCat.weight && this.age==anotherCat.age && this.strength==anotherCat.strength) return false;
        else if (this.strength<anotherCat.strength && this.age==anotherCat.age && this.weight==anotherCat.weight) return false;

        else if (this.age<anotherCat.age && this.weight<anotherCat.weight) return false;
        else if (this.weight<anotherCat.weight && this.strength<anotherCat.strength) return false;
        else if (this.age<anotherCat.age && this.strength<anotherCat.strength) return false;
            return true;

    }

    public static void main(String[] args) {

    }
}
