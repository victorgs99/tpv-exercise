package oop.inheritance.verifone.verifone240m;

import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.model.services.*;
import oop.inheritance.verifone.verifone240m.services.*;

public class VerifoneV240m extends Tpv {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneV240mCardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneV240mChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneV240mDisplay.getInstance();
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
        return VerifoneV240mKeyboard.getInstance();
    }

    @Override
    public Modem getModem() {
        return null;
    }

    @Override
    public Printer getPrinter() {
        return VerifoneV240mPrinter.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneV240mStorageSystem.getInstance();
    }
}
