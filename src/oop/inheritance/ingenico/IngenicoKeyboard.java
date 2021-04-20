package oop.inheritance.ingenico;

import oop.inheritance.core.TPVKeyboard;

public class IngenicoKeyboard implements TPVKeyboard {

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
