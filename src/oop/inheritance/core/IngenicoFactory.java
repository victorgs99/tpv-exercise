package oop.inheritance.core;

import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.ingenico.IngenicoKeyboard;
import oop.inheritance.ingenico.IngenicoPrinter;
import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoEthernet;

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


    @Override
    public TPVChipReader getChipReader() {
        return new IngenicoChipReader();
    }


    @Override
    public TPVEthernet getEthernet() {
        return new IngenicoEthernet();
    }



}
