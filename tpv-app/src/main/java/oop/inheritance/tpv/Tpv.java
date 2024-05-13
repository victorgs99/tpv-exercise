package oop.inheritance.tpv;

import oop.inheritance.tpv.model.services.*;

public abstract class Tpv {
    public abstract CardSwipper getCardSwipper();

    public abstract ChipReader getChipReader();

    public abstract Display getDisplay();

    public abstract Ethernet getEthernet();

    public abstract Gps getGps();

    public abstract Keyboard getKeyboard();

    public abstract Modem getModem();

    public abstract Printer getPrinter();

    public abstract StorageSystem getStorageSystem();
}
