package oop.inheritance.ingenico.services;

import oop.inheritance.tpv.model.services.Printer;

public final class IngenicoPrinter implements Printer {
    private static IngenicoPrinter instance;

    private IngenicoPrinter(){}

    public static IngenicoPrinter getInstance(){
        if (instance == null)
            instance = new IngenicoPrinter();

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
