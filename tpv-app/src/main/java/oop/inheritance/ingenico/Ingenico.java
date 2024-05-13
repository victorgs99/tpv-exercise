package oop.inheritance.ingenico;

import oop.inheritance.ingenico.services.*;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.model.services.*;

public class Ingenico extends Tpv {

    @Override
    public Ethernet getEthernet() {
        return IngenicoEthernet.getInstance();
    }

    @Override
    public Gps getGps() {
        return IngenicoGPS.getInstance();
    }

    @Override
    public Modem getModem() {
        return IngenicoModem.getInstance();
    }

    @Override
    public CardSwipper getCardSwipper() {
        return IngenicoCardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return IngenicoChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return IngenicoDisplay.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return IngenicoKeyboard.getInstance();
    }

    @Override
    public Printer getPrinter() {
        return IngenicoPrinter.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return IngenicoStorageSystem.getInstance();
    }
}
