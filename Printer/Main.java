package com.mircea;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(75,5,true);
        System.out.println("this is finalToner level = " + printer.fillToner());

        System.out.println(printer.printPages());
    }
}
