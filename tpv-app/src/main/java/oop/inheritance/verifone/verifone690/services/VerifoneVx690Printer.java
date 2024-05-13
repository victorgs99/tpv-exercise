package oop.inheritance.verifone.verifone690.services;

import oop.inheritance.tpv.model.services.Printer;

public class VerifoneVx690Printer implements Printer {
    private static VerifoneVx690Printer instance;

    private VerifoneVx690Printer(){}

    public static VerifoneVx690Printer getInstance(){
        if (instance == null)
            instance = new VerifoneVx690Printer();

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
