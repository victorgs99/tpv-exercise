package oop.inheritance.verifone.factory;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.factory.TpvFactory;

public class VerifoneTpvFactory extends TpvFactory {
    @Override
    public Tpv create(SupportedTpvModels verifoneTpvModel){
        return VerifoneTpvConfiguration.getVerifoneTpv(verifoneTpvModel);
    }
}
