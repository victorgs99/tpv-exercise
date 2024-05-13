package oop.inheritance.ingenico.services;

import oop.inheritance.tpv.model.services.Keyboard;

public final class IngenicoKeyboard implements Keyboard {
    private static IngenicoKeyboard instance;

    private IngenicoKeyboard(){}

    public static IngenicoKeyboard getInstance(){
        if (instance == null)
            instance = new IngenicoKeyboard();

        return instance;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
