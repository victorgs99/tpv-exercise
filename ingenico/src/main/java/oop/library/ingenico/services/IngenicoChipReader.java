package oop.library.ingenico.services;


import oop.library.ingenico.model.Card;
import oop.library.ingenico.model.EntryMode;
import oop.library.ingenico.model.ExpirationDate;

public class IngenicoChipReader {

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
