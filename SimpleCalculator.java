package com.mircea;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber (double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getFirstNumber () {
        return this.firstNumber;
    }
    public double getSecondNumber () {
        return this.secondNumber;
    }
    public double getAdditionResult () {
        double addition = firstNumber + secondNumber;
        return addition;
    }
    public double getSubstractionResult () {
        double substraction = firstNumber - secondNumber;
        return substraction;
    }
    public double getMultiplicationResult () {
        double multiplication = firstNumber * secondNumber;
        return multiplication;
    }
    public double getDivisionResult (){
        if (secondNumber == 0) {
            return 0;
        }
        double division = firstNumber/secondNumber;
        return division;
    }
}
