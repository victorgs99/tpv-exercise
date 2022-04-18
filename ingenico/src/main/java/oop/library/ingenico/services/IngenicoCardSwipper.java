package oop.library.ingenico.services;

import oop.library.ingenico.model.Card;
import oop.library.ingenico.model.EntryMode;
import oop.library.ingenico.model.ExpirationDate;

public class IngenicoCardSwipper {

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
