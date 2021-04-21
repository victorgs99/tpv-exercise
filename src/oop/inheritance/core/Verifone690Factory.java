package oop.inheritance.core;

import oop.inheritance.verifone.vx690.VerifoneVx690Display;
import oop.inheritance.verifone.vx690.VerifoneVx690Keyboard;

public class Verifone690Factory extends TPVAbstractFactory{
    @Override
    public TPVDisplay getDisplay() {
        return new VerifoneVx690Display();
    }

    @Override
    public TPVKeyboard getKeyboard() {
        return new VerifoneVx690Keyboard();
    }

    @Override
    public TPVPrinter getPrinter() {
        return new VerifoneVx690Printer();
    }

    @Override
    public TPVCardSwipper getCardSwipper() {
        return new VerifoneVx690CardSwipper();
    }


    @Override
    public TPVChipReader getChipReader() {
        return new VerifoneVx690ChipReader();
    }

}
