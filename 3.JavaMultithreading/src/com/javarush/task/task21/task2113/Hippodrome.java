package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List horses){
        this.horses = horses;
    }

    static Hippodrome game;

    void move(){
        for (Horse horse: horses) {
            horse.move();
        }
    }

    void print(){

    }

    void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("alma",3,0));
        game.getHorses().add(new Horse("backy",3,0));
        game.getHorses().add(new Horse("cinatra",3,0));
    }
}
