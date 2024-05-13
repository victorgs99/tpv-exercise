package oop.inheritance.verifone.verifone520.services;

import oop.inheritance.tpv.model.services.Keyboard;

public class VerifoneVx520Keyboard implements Keyboard {
    private static VerifoneVx520Keyboard instance;

    private VerifoneVx520Keyboard(){}

    public static VerifoneVx520Keyboard getInstance(){
        if (instance == null)
            instance = new VerifoneVx520Keyboard();

        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
