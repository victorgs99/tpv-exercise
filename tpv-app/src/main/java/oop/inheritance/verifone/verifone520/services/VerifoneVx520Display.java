package oop.inheritance.verifone.verifone520.services;

import oop.inheritance.tpv.model.services.Display;

public class VerifoneVx520Display implements Display {
    private static VerifoneVx520Display instance;

    private VerifoneVx520Display(){}

    public static VerifoneVx520Display getInstance(){
        if (instance == null)
            instance = new VerifoneVx520Display();

        return instance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
