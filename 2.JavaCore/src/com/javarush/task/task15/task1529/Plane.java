package com.javarush.task.task15.task1529;

public class Plane implements CanFly{

    private int numberPassengers;

    @Override
    public void fly() {

    }

    Plane(int numberPassengers){
        this.numberPassengers = numberPassengers;
    }
}
