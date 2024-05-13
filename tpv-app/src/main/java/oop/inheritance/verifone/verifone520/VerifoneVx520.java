package oop.inheritance.verifone.verifone520;

import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.model.services.*;
import oop.inheritance.verifone.verifone520.services.*;

public class VerifoneVx520 extends Tpv {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneVx520CardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneVx520ChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneVx520Display.getInstance();
    }

    @Override
    public Ethernet getEthernet() {
        return null;
    }

    @Override
    public Gps getGps() {
        return null;
    }

    @Override
    public Keyboard getKeyboard() {
        return VerifoneVx520Keyboard.getInstance();
    }

    @Override
    public Modem getModem() {
        return null;
    }

    @Override
    public Printer getPrinter() {
        return VerifoneVx520Printer.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneVx520StorageSystem.getInstance();
    }
}
