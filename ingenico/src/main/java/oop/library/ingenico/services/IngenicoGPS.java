package oop.library.ingenico.services;

import oop.library.ingenico.model.Transaction;
import oop.library.ingenico.model.TransactionResponse;

public final class IngenicoGPS {
    private static IngenicoGPS instance;

    private IngenicoGPS(){}

    public static IngenicoGPS getInstance(){
        if (instance == null)
            instance = new IngenicoGPS();

        return instance;
    }
    /**
     * Opens a connection using the GPS device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param message message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public boolean send(Transaction message) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public TransactionResponse receive() {
        return new TransactionResponse(true, "782132");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}
