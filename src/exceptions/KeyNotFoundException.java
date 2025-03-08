package exceptions;

/**
 * ExistingKeyException.java
 * 
 * @author Aishte Pitpit
 */
@SuppressWarnings( "serial" )
public class KeyNotFoundException extends Exception {

    public KeyNotFoundException() {
        super("Key not found in the dictionary.");
    }

    /**
     * @param message Custom error message.
     */
    public KeyNotFoundException(String message) {
        super(message);
    }
}