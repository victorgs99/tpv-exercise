package oop.inheritance.verifone.verifone240m.services;

import oop.inheritance.tpv.model.services.Printer;

public class VerifoneV240mPrinter implements Printer {
    private static VerifoneV240mPrinter instance;

    private VerifoneV240mPrinter(){}

    public static VerifoneV240mPrinter getInstance(){
        if (instance == null)
            instance = new VerifoneV240mPrinter();

        return instance;
    }

    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}
