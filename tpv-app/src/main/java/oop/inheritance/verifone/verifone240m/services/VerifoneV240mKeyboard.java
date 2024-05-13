package oop.inheritance.verifone.verifone240m.services;

import oop.inheritance.tpv.model.services.Keyboard;

public class VerifoneV240mKeyboard implements Keyboard {
    private static VerifoneV240mKeyboard instance;

    private VerifoneV240mKeyboard(){}

    public static VerifoneV240mKeyboard getInstance(){
        if (instance == null)
            instance = new VerifoneV240mKeyboard();

        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
