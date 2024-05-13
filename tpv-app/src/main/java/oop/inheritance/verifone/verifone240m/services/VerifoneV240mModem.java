package oop.inheritance.verifone.verifone240m.services;

public class VerifoneV240mModem {
    private static VerifoneV240mModem instance;

    private VerifoneV240mModem(){}

    public static VerifoneV240mModem getInstance(){
        if (instance == null)
            instance = new VerifoneV240mModem();

        return instance;
    }

    /**
     * Opens a connection using the modem device
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
    public boolean send(byte[] message) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public byte[] receive() {
        return "response".getBytes();
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}
