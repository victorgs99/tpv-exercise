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

    @Override
    public TPVPrinter getPrinter() {
        return new VerifoneV240mPrinter();
    }

    @Override
    public TPVCardSwipper getCardSwipper() {
        return new VerifoneV240mCardSwipper();
    }

    @Override
    public TPVChipReader getChipReader() {
        return new VerifoneV240mChipReader();
    }


}
