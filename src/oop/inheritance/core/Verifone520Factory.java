package oop.inheritance.core;

import oop.inheritance.verifone.vx520.VerifoneVx520Display;
import oop.inheritance.verifone.vx520.VerifoneVx520Keyboard;

public class Verifone520Factory extends TPVAbstractFactory {
    @Override
    public TPVDisplay getDisplay() {
        return new VerifoneVx520Display();
    }

    @Override
    public TPVKeyboard getKeyboard() {
        return new VerifoneVx520Keyboard();
    }

    @Override
    public TPVPrinter getPrinter() {
        return new VerifoneVx520Printer();
    }


}
