package oop.inheritance.ingenico.factory;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.ingenico.Ingenico;
import oop.inheritance.tpv.Tpv;

public class IngenicoTpvConfiguration {
    public static Tpv getVerifoneTpv(SupportedTpvModels ingenicoTpvModel) {
        switch (ingenicoTpvModel){
            case INGENICO:
                return new Ingenico();

            default:
                throw new RuntimeException("Ingenivo Tpv model not supported");
        }
    }
}