package oop.inheritance.core;

import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoKeyboard;

public class IngenicoFactory extends TPVAbstractFactory{

    @Override
    public TPVDisplay getDisplay() {
        return new IngenicoDisplay();
    }

    @Override
    public TPVKeyboard getKeyboard() {
        return new IngenicoKeyboard();
    }

    @Override
    public TPVPrinter getPrinter() {
        return new IngenicoPrinter();
    }

    @Override
    public TPVCardSwipper getCardSwipper() {
        return new IngenicoCardSwipper();
    }

}
