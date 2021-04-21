package oop.inheritance;

import java.time.LocalDateTime;

import oop.inheritance.core.TPVAbstractFactory;
import oop.inheritance.core.TPVDisplay;
import oop.inheritance.core.TPVKeyboard;
import oop.inheritance.data.Card;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;
import oop.inheritance.ingenico.IngenicoCardSwipper;
import oop.inheritance.ingenico.IngenicoChipReader;
import oop.inheritance.ingenico.IngenicoEthernet;
import oop.inheritance.ingenico.IngenicoGPS;
import oop.inheritance.ingenico.IngenicoKeyboard;
import oop.inheritance.ingenico.IngenicoModem;
import oop.inheritance.ingenico.IngenicoPrinter;

public class Application {

    private final CommunicationType communicationType = CommunicationType.ETHERNET;
    private final TPVAbstractFactory tpvFactory;

    public Application(SupportedTerminal supportedTerminal) {
        tpvFactory = TPVAbstractFactory.getFactory(supportedTerminal);
    }

    public void showMenu() {
        TPVDisplay tpvDisplay = tpvFactory.getDisplay();

        tpvDisplay.showMessage(5, 5, "MENU");
        tpvDisplay.showMessage(5, 10, "1. VENTA");
        tpvDisplay.showMessage(5, 13, "2. DEVOLUCION");
        tpvDisplay.showMessage(5, 16, "3. REPORTE");
        tpvDisplay.showMessage(5, 23, "4. CONFIGURACION");
    }

    public String readKey() {
        TPVKeyboard tpvKeyboard = tpvFactory.getKeyboard();
        return tpvKeyboard.get();
    }

    public void doSale() {
        IngenicoCardSwipper cardSwipper = new IngenicoCardSwipper();
        IngenicoChipReader chipReader = new IngenicoChipReader();
        TPVDisplay tpvDisplay = tpvFactory.getDisplay();
        TPVKeyboard tpvKeyboard = tpvFactory.getKeyboard();
        Card card;

        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        tpvDisplay.clear();
        tpvDisplay.showMessage(5, 20, "Capture monto:");

        String amount = tpvKeyboard.get(); //Amount with decimal point as string

        Transaction transaction = new Transaction();

        transaction.setLocalDateTime(LocalDateTime.now());
        transaction.setCard(card);
        transaction.setAmountInCents(Integer.parseInt(amount.replace(".", "")));

        TransactionResponse response = sendSale(transaction);

        if (response.isApproved()) {
            tpvDisplay.showMessage(5, 25, "APROBADA");
            printReceipt(transaction, response.getHostReference());
        } else {
            tpvDisplay.showMessage(5, 25, "DENEGADA");
        }
    }

    private void printReceipt(Transaction transaction, String hostReference) {

        TPVPrinter tpvPrinter= tpvFactory.getPrinter();
        Card card = transaction.getCard();

        tpvPrinter.print(5, "APROBADA");
        tpvPrinter.lineFeed();
        tpvPrinter.print(5, card.getAccount());
        tpvPrinter.lineFeed();
        tpvPrinter.print(5, "" + transaction.getAmountInCents());
        tpvPrinter.lineFeed();
        tpvPrinter.print(5, "________________");

    }

    private TransactionResponse sendSale(Transaction transaction) {
        IngenicoEthernet ethernet = new IngenicoEthernet();
        IngenicoModem modem = new IngenicoModem();
        IngenicoGPS gps = new IngenicoGPS();
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
        TPVDisplay tpvDisplay = tpvFactory.getDisplay();
        tpvDisplay.clear();
    }
}
