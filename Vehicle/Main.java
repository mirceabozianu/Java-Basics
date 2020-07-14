package com.mircea;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Bmw" , 4,1,6);
        Car bmw = new Car("Bmw",4,1,1,4);
        bmw.move(100);
        Porsche porsche = new Porsche(4,1,4,1);
        porsche.changingGears();
        porsche.handSteering();

    }

}
