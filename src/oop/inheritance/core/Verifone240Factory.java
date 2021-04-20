package oop.inheritance.core;

import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mKeyboard;

public class Verifone240Factory extends TPVAbstractFactory{
    @Override
    public TPVDisplay getDisplay() {
        return new VerifoneV240mDisplay();
    }

    @Override
    public TPVKeyboard getKeyboard() {
        return new VerifoneV240mKeyboard();
    }
}
