package com.mircea;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
        this.doors = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String startEngine () {
        return "The engine has started";
    }
    public String accelerate () {
        return "Car accelerated";
    }
    public String brake () {
        return "Car has stopped";
    }
}

class Mustang extends Car {
    public Mustang() {
        super("Mustang", 8);
    }

    @Override
    public String startEngine() {
        return "Engind starts by pushing a button";
    }

    @Override
    public String accelerate() {
        return "Mustang accelerates 1-100 in 3 s";
    }

    @Override
    public String brake() {
        return "Mustang brakes in an instant";
    }
}
class Volvo extends Car {
    public Volvo() {
        super("Volvo", 6);
    }

    @Override
    public String startEngine() {
        return "Engine starts by turning the key";
    }

    @Override
    public String accelerate() {
        return "Volvo accelerates 1-100 in 10 s";
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
class Ford extends Car {
    public Ford() {
        super("Ford", 6);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " starts by turning the key";
    }

    @Override
    public String accelerate() {
        return "Ford accelerates 1-100 in  7 s";
    }

    @Override
    public String brake() {
        return super.brake();
    }
}





public class Main {

    public static void main(String[] args) {

        Car car = new Car("Base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford();
        System.out.println(ford.getName() + " is the car" + "\n" + ford.accelerate());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());




    }



}
