package oop.inheritance.ingenico.services;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.model.services.CardSwipper;

public final class IngenicoCardSwipper implements CardSwipper {
    private static  IngenicoCardSwipper instance;

    private IngenicoCardSwipper(){}

    public static IngenicoCardSwipper getInstance(){
        if (instance == null)
            instance = new IngenicoCardSwipper();

        return instance;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
