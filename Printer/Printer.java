package com.mircea;

public class Printer {

    private int tonerLevel = 100;
    private int pages;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pages, boolean isDuplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        }
        this.pages = pages;
        this.isDuplexPrinter = isDuplexPrinter;
    }
    public String printPages () {
        if (pages > 0 && !isDuplexPrinter) {
            for (int i = 1; i <= this.pages; i++) {
                System.out.println("Pages printed = " + i);
            }
        }
        return "Pages printed in total: " + this.pages;
    }

    public String fillToner () {
        if (tonerLevel >= 0 && tonerLevel < 100) {
            for (int i = this.tonerLevel; i <= 100; i++) {
                System.out.println("Toner is filling up and is " + i + "%");
                this.tonerLevel = i;
            }
        }
        return ("Toner is " + this.tonerLevel + "%");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
