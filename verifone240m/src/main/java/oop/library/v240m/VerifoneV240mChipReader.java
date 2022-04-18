package oop.library.v240m;

import oop.library.verifone.model.Card;
import oop.library.verifone.model.EntryMode;
import oop.library.verifone.model.ExpirationDate;

public class VerifoneV240mChipReader {

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
