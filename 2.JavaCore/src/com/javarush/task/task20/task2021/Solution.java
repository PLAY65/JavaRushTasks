package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/

public class Solution implements Serializable {

    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException();
    }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        throw new NotSerializableException();
    }

    public static class SubSolution extends Solution {
        public SubSolution(){
        }

    }

    public static void main(String[] args) {

    }
}
