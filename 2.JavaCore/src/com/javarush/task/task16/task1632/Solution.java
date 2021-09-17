package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
            threads.add(new TestThread1());
            threads.add(new TestThread2());
            threads.add(new TestThread3());
            threads.add(new TestThread4());
            threads.add(new TestThread5());
    }

    public static void main(String[] args) {
        threads.get(3).start();

        try {
            Thread.sleep(3000);

            System.out.println(threads.get(3).isAlive());
            ((TestThread4)threads.get(3)).showWarning();
            Thread.sleep(1000);
            System.out.println(threads.get(3).isAlive());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class TestThread1 extends Thread{

        public void run(){
            while (true){
                //infinitely
            }
        }
    }

    public static class TestThread2 extends Thread{

        public void run(){
            boolean isCurrentThreadInterrupted = false;
            try {
                while (!isCurrentThreadInterrupted) {
                    isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class TestThread3 extends Thread{

        public void run(){
            while (true){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class TestThread4 extends Thread implements Message{

        //private boolean stop = true;

        public void run(){
            while (!isInterrupted()){}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class TestThread5 extends Thread{

        boolean isCurrentThreadInterrupted = false;
        int sum = 0;
        public void run(){
            while (!isCurrentThreadInterrupted){
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String line = null;
                try {
                    line = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(!line.equals("N")){
                sum+=Integer.parseInt(line);
                }
                else {
                    System.out.println(sum);
                    isCurrentThreadInterrupted = true;
                }
            }
        }
    }
}