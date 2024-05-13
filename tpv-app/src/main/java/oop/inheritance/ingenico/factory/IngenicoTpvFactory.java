package oop.inheritance.ingenico.factory;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.factory.TpvFactory;

public class IngenicoTpvFactory extends TpvFactory {
    @Override
    public Tpv create(SupportedTpvModels ingenicoTpvModel){
        return IngenicoTpvConfiguration.getVerifoneTpv(ingenicoTpvModel);
    }
}
