package oop.inheritance.verifone.verifone240m.services;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.model.services.CardSwipper;

public class VerifoneV240mCardSwipper implements CardSwipper {
    private static VerifoneV240mCardSwipper instance;

    private VerifoneV240mCardSwipper(){}

    public static VerifoneV240mCardSwipper getInstance(){
        if (instance == null)
            instance = new VerifoneV240mCardSwipper();

        return instance;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
