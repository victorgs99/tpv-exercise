package oop.inheritance.verifone.verifone690;

import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.model.services.*;
import oop.inheritance.verifone.verifone690.services.*;

public class VerifoneVx690 extends Tpv {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneVx690CardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneVx690ChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneVx690Display.getInstance();
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
        return VerifoneVx690Keyboard.getInstance();
    }

    @Override
    public Modem getModem() {
        return null;
    }

    @Override
    public Printer getPrinter() {
        return VerifoneVx690Printer.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneVx690StorageSystem.getInstance();
    }
}
