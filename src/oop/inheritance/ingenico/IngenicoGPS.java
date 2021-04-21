package oop.inheritance.ingenico;

import oop.inheritance.core.TPVGps;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public class IngenicoGPS implements TPVGps {
    /**
     * Opens a connection using the GPS device
     *
     */
    public void open() {


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
