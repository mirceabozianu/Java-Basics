package com.mircea;

public class Car extends Vehicle {

    private int doors;
    private int steeringWheel;
    private int honk;
    private int windows;

    public Car(String name, int doors, int steeringWheel, int honk, int windows) {
        super(name, 4, 1, 1);
        this.doors = doors;
        this.steeringWheel = steeringWheel;
        this.honk = honk;
        this.windows = windows;
    }
    private void increaseSpeed () {
        System.out.println("The car can accelerate");
    }
    private void decreaseSpeed () {
        System.out.println("The car can slow down");
    }

    @Override
    public void move(int speed) {
        increaseSpeed();
        decreaseSpeed();
        super.move(speed);
    }

    private void automaticGearChanging () {
        System.out.println("This car changes gears automatically");
    }

    @Override
    public void changingGears() {
        automaticGearChanging();
        super.changingGears();
    }
}
