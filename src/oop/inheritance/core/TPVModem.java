package oop.inheritance.core;


import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public interface TPVModem {
    boolean open();
    boolean send(Transaction transaction);
    TransactionResponse receive();
    void close();
}
