package oop.inheritance.ingenico.services;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.tpv.model.services.ChipReader;

public final class IngenicoChipReader implements ChipReader {
    private static  IngenicoChipReader instance;

    private IngenicoChipReader(){}

    public static IngenicoChipReader getInstance() {
        if (instance == null)
            instance = new IngenicoChipReader();

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
