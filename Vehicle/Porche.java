package com.mircea;

class Porsche extends Car {
    private int lights;
    private int goodEngine;
    private int niceRims;
    private int automaticGearBox;

    public Porsche(int lights, int goodEngine, int niceRims, int automaticGearBox) {
        super("Porsche", 4, 1,1, 4);
        this.lights = lights;
        this.goodEngine = goodEngine;
        this.niceRims = niceRims;
        this.automaticGearBox = automaticGearBox;
    }

    private void sportMode () {
        System.out.println("This car can go into sport mode");
    }

    @Override
    public void changingGears() {
        sportMode();
        super.changingGears();
    }
    private void autoSteering () {
        System.out.println("This car autosteers with the help of AI");
    }

    @Override
    public void handSteering() {
        autoSteering();
        super.handSteering();
    }
}
