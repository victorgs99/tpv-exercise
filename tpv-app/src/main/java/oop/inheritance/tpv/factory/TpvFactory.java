package oop.inheritance.tpv.factory;

import oop.inheritance.data.SupportedTpvModels;
import oop.inheritance.tpv.Tpv;

public abstract class TpvFactory {
    public abstract Tpv create(SupportedTpvModels tvpModel);
}
