package oop.inheritance.core;

import oop.inheritance.verifone.vx520.*;

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

    @Override
    public TPVCardSwipper getCardSwipper() {
        return new VerifoneVx520CardSwipper();
    }

    @Override
    public TPVChipReader getChipReader() {
        return new VerifoneVx520ChipReader();
    }

    @Override
    public TPVEthernet getEthernet() {
        return new VerifoneVx520Ethernet();
    }

    @Override
    public TPVModem getModem() {
        return new VerifoneVx520Modem();
    }

}
