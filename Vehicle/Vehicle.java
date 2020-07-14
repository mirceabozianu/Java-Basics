package com.mircea;

public class Vehicle {
    private String name;
    private int wheels;
    private int steering;
    private int gears;

    public Vehicle(String name, int wheels, int steering, int gears) {
        this.name = name;
        this.wheels = wheels;
        this.steering = steering;
        this.gears = gears;
    }

    public void move () {
        System.out.println("Vehicle.move called");
    }

    public void move (int speed) {
        System.out.println("This Vehicle is moving with this speed " + speed);
    }

    public void changingGears () {
        System.out.println("This vehicle can change gears");
    }

    public void handSteering () {
        System.out.println("This vehicle can be handsteered");
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }
}
