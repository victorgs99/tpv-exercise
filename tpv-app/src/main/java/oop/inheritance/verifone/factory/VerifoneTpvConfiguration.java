package oop.inheritance.verifone.factory;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.verifone.verifone240m.VerifoneV240m;
import oop.inheritance.verifone.verifone520.VerifoneVx520;
import oop.inheritance.verifone.verifone690.VerifoneVx690;

public class VerifoneTpvConfiguration {
    public static Tpv getVerifoneTpv(SupportedTpvModels verifoneTpvModel) {
        switch (verifoneTpvModel){
            case VERIFONEV240M:
                return new VerifoneV240m();
            case VERIFONEVX520:
                return new VerifoneVx520();
            case VERIFONEVX690:
                return new VerifoneVx690();

            default:
                throw new RuntimeException("Verifone Tpv model not supported");
        }
    }
}