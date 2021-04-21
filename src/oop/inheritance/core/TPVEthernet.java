package oop.inheritance.core;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public interface TPVPrinter {
    void open();
    void send(Transaction transaction);
    TransactionResponse receive();
    void close();
}
