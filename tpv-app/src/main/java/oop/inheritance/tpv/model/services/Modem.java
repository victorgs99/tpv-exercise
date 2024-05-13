package oop.inheritance.tpv.model.services;

import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public interface Modem {
    boolean open();

    boolean send(Transaction transaction);

    TransactionResponse receive();

    void close();
}
