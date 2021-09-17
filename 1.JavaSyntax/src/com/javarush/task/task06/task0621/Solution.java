package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String grandFatherName = reader.readLine();
        Cat catGrandF = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandM = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null,catGrandF);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandM,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother,catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother,catFather);



        System.out.println(catGrandF);
        System.out.println(catGrandM);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        //private Cat parent;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentMother) {
            this.name = name;
            this.parentMother = parentMother;
        }

        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            if (parentMother == null) {
                if (parentFather == null) {
                    return "The cat's name is " + name + ", no mother, no father";
                } else if (parentFather != null)
                    return "The cat's name is " + name + ", no mother, father is " + parentFather.name;
            } else if (parentMother != null) {
                if (parentFather == null) {
                    return "The cat's name is " + name + ", mother is " + parentMother.name + ", no father";
                } else if (parentFather != null)
                    return "The cat's name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            }
            return "";
        }

    }
}

