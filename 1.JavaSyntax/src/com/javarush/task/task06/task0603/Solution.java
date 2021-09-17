package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {

        for (int i = 0; i < 50000; i++) {
            Cat cat1 = new Cat();
            Dog dog1 = new Dog();

           /* try {
                cat1.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            try {
                dog1.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }*/


        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
