package oop.inheritance.verifone.verifone690.services;

import oop.inheritance.tpv.model.services.Keyboard;

public class VerifoneVx690Keyboard implements Keyboard {
    private static VerifoneVx690Keyboard instance;

    private VerifoneVx690Keyboard(){}

    public static VerifoneVx690Keyboard getInstance(){
        if (instance == null)
            instance = new VerifoneVx690Keyboard();

        return instance;
    }

    public String get(){
        return "Key pressed";
    }
}
