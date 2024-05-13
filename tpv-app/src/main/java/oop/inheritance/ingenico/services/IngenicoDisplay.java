package oop.inheritance.ingenico.services;

import oop.inheritance.tpv.model.services.Display;

public final class IngenicoDisplay implements Display {
    private static IngenicoDisplay instance;

    private IngenicoDisplay(){}

    public static IngenicoDisplay getInstance(){
        if (instance == null)
            instance = new IngenicoDisplay();

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
