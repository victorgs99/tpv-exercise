package oop.inheritance.tpv.factory;

import oop.inheritance.ingenico.Ingenico;
import oop.inheritance.ingenico.factory.IngenicoTpvConfiguration;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.verifone.factory.VerifoneTpvConfiguration;

public class TpvFactoryConfiguration {
    private IngenicoTpvConfiguration ingenicoTpvConfiguration;
    private VerifoneTpvConfiguration verifoneTpvConfiguration;


    public TpvFactoryConfiguration(){
        ingenicoTpvConfiguration = new IngenicoTpvConfiguration();
        verifoneTpvConfiguration = new VerifoneTpvConfiguration();
    }
}
