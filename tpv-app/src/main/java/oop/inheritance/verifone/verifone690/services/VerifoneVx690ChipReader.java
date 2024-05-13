package oop.inheritance.verifone.verifone690.services;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.model.services.ChipReader;

public class VerifoneVx690ChipReader implements ChipReader {
    private static VerifoneVx690ChipReader instance;

    private VerifoneVx690ChipReader(){}

    public static VerifoneVx690ChipReader getInstance(){
        if (instance == null)
            instance = new VerifoneVx690ChipReader();

        return instance;
    }

    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}
