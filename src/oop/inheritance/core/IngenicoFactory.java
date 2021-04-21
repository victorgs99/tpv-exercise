package oop.inheritance.core;

import oop.inheritance.ingenico.*;

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


    @Override
    public TPVModem getModem() {
        return new IngenicoModem();
    }

    @Override
    public TPVGps getGps() {
        return new IngenicoGPS();
    }


}
