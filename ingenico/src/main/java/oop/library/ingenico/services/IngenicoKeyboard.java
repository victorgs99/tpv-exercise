package oop.library.ingenico.services;

public final class IngenicoKeyboard {
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
