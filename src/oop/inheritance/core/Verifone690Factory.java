package oop.inheritance.core;

import oop.inheritance.verifone.vx690.*;

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

    @Override
    public TPVEthernet getEthernet() {
        return new VerifoneVx690Ethernet();
    }


    @Override
    public TPVModem getModem() {
        return new VerifoneVx690Modem();
    }

}
