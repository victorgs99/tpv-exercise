package oop.inheritance;

import java.time.LocalDateTime;

import oop.inheritance.core.*;
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
        TPVCardSwipper tpvCardSwipper = tpvFactory.getCardSwipper();
        TPVChipReader tpvChipReader = tpvFactory.getChipReader();
        TPVDisplay tpvDisplay = tpvFactory.getDisplay();
        TPVKeyboard tpvKeyboard = tpvFactory.getKeyboard();

        Card card = readCard(tpvCardSwipper,tpvChipReader);


        tpvDisplay.clear();
        tpvDisplay.showMessage(5, 20, "Capture monto:");

        String amount = tpvKeyboard.get(); //Amount with decimal point as string

        if (doTransaction(card,amount)) {
            tpvDisplay.showMessage(5, 25, "APROBADA");
            //printReceipt(transaction, response.getHostReference());
        } else {
            tpvDisplay.showMessage(5, 25, "DENEGADA");
        }
    }


    private Card readCard(TPVCardSwipper tpvCardSwipper, TPVChipReader tpvChipReader){
      Card card=null;
      do {
          card = tpvCardSwipper.readCard();
          if (card == null) {
              card = tpvChipReader.readCard();
          }
      } while (card == null);
      return card;
    }


    private boolean doTransaction(Card card,String amount){
      Transaction transaction = new Transaction();
      transaction.setLocalDateTime(LocalDateTime.now());
      transaction.setCard(card);
      transaction.setAmountInCents(Integer.parseInt(amount.replace(".", "")));

      TransactionResponse response = sendSale(transaction);
      return response.isApproved();
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
        TPVEthernet tpvEthernet = tpvFactory.getEthernet();
        TPVModem tpvModem = tpvFactory.getModem();
        TPVGps tpvGps = tpvFactory.getGps();

        TransactionResponse transactionResponse = null;

        switch (communicationType) {
            case ETHERNET:
                tpvEthernet.open();
                tpvEthernet.send(transaction);
                transactionResponse = tpvEthernet.receive();
                tpvEthernet.close();
                break;
            case GPS:
                tpvGps.open();
                tpvGps.send(transaction);
                transactionResponse = tpvGps.receive();
                tpvGps.close();
                break;
            case MODEM:
                tpvModem.open();
                tpvModem.send(transaction);
                transactionResponse = tpvModem.receive();
                tpvModem.close();
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
