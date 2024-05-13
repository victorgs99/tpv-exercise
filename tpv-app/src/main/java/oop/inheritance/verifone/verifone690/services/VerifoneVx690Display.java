package oop.inheritance.verifone.verifone690.services;

import oop.inheritance.tpv.model.services.Display;

public class VerifoneVx690Display implements Display {
    private static VerifoneVx690Display instance;

    private VerifoneVx690Display(){}

    public static VerifoneVx690Display getInstance(){
        if (instance == null)
            instance = new VerifoneVx690Display();

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
