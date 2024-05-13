package oop.inheritance;

import java.time.LocalDateTime;

import oop.inheritance.data.*;
import oop.inheritance.tpv.Tpv;
import oop.inheritance.tpv.model.services.*;

public class Application {

    private CommunicationType communicationType = CommunicationType.ETHERNET;
    private Tpv tpv;

    public Application(Tpv tpv) {
        this.tpv = tpv;
    }

    public void showMenu() {
        Display display = tpv.getDisplay();

        display.showMessage(5, 5, "MENU");
        display.showMessage(5, 10, "1. VENTA");
        display.showMessage(5, 13, "2. DEVOLUCION");
        display.showMessage(5, 16, "3. REPORTE");
        display.showMessage(5, 23, "4. CONFIGURACION");
    }

    public String readKey() {
        Keyboard keyboard = tpv.getKeyboard();

        return keyboard.get();
    }

    public void doSale() {
        CardSwipper cardSwipper = tpv.getCardSwipper();
        ChipReader chipReader = tpv.getChipReader();
        Display ingenicoDisplay = tpv.getDisplay();
        Keyboard ingenicoKeyboard = tpv.getKeyboard();
        Card card;

        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        ingenicoDisplay.clear();
        ingenicoDisplay.showMessage(5, 20, "Capture monto:");

        String amount = ingenicoKeyboard.get(); //Amount with decimal point as string

        Transaction transaction = Transaction.builder()
                        .localDateTime(LocalDateTime.now())
                        .card(card)
                        .amountInCents(Integer.parseInt(amount.replace(".", "")))
                        .build();

        TransactionResponse response = sendSale(transaction);

        if (response.isApproved()) {
            ingenicoDisplay.showMessage(5, 25, "APROBADA");
            printReceipt(transaction, response.getHostReference());
        } else {
            ingenicoDisplay.showMessage(5, 25, "DENEGADA");
        }
    }

    private void printReceipt(Transaction transaction, String hostReference) {
        Printer printer = tpv.getPrinter();
        Card card = transaction.getCard();

        printer.print(5, "APROBADA");
        printer.lineFeed();
        printer.print(5, card.getAccount());
        printer.lineFeed();
        printer.print(5, "" + transaction.getAmountInCents());
        printer.lineFeed();
        printer.print(5, "________________");

    }

    private TransactionResponse sendSale(Transaction transaction) {
        Ethernet ethernet = tpv.getEthernet();
        Modem modem = tpv.getModem();
        Gps gps = tpv.getGps();
        TransactionResponse transactionResponse = null;

        switch (communicationType) {
            case ETHERNET:
                ethernet.open();
                ethernet.send(transaction);
                transactionResponse = ethernet.receive();
                ethernet.close();
                break;
            case GPS:
                gps.open();
                gps.send(transaction);
                transactionResponse = gps.receive();
                gps.close();
                break;
            case MODEM:
                modem.open();
                modem.send(transaction);
                transactionResponse = modem.receive();
                modem.close();
                break;
        }

        return transactionResponse;
    }

    public void doRefund() {
    }

    public void printReport() {
    }

    public void showConfiguration() {
    }

    public void clearScreen() {
        Display display = tpv.getDisplay();

        display.clear();
    }
}
