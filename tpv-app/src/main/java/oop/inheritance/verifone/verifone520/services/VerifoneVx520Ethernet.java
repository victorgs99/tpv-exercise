package oop.inheritance.verifone.verifone520.services;

public class VerifoneVx520Ethernet {
    private static VerifoneVx520Ethernet instance;

    private VerifoneVx520Ethernet(){}

    public static VerifoneVx520Ethernet getInstance(){
        if (instance == null)
            instance = new VerifoneVx520Ethernet();

        return instance;
    }

    /**
     * Opens a connection using the ethernet device
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
