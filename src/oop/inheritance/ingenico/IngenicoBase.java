package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

import java.util.Properties;


public interface IngenicoBase {
    //IngenicoCardSwipper
    public default Card redCard(){
    };

    //IgenicoChipReader
    public default Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

    //IngenicoDisplay
    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public default void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public default void clear() {

    }

    //IngenicoEthernet

    /**
     * Opens a connection using the ethernet device
     *
     * @return true if the connection was successfully opened
     */
    public default boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param transaction message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public default boolean send(Transaction transaction) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public default TransactionResponse receive() {
        return new TransactionResponse(true, "12314");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public default void close() {

    }

    //IngenicoGPS
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

    //IngenicoKeyboard
    public class IngenicoKeyboard{
        /**
         * @return key pressed
         */
        public String get(){
            return "key pressed";
        }
    }
    //IngenicoModem
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
        return new TransactionResponse(true, "132123");
    }

    //Ingenico Printer

    /**
     * Prints a message an the current line at the specified horizontal position
     *
     * @param X     horizontal offset
     * @param message Message to be printed
     */
    public default void print(int x, String message){

    }
    /**
     * Add a line brreak to the paper
     */
    public default void lineFeed(){}

    //IngenicoStorageSystem
    private Properties properties = new Properties();

    public default void save(String key, String value){
        properties.setProperty(key,value);
    }
    public default String get(String key){
        return properties.getProperty(key);
    }





}
