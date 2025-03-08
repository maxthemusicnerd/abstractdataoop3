package exceptions;

/**
 * ExistingKeyException.java
 * 
 * @author Aishte Pitpit
 */
@SuppressWarnings( "serial" )
public class ExistingKeyException extends Exception {

    public ExistingKeyException() {
        super("Existing key detected. Each key must be unique");
    }

    /**
     * @param message Custom error message.
     */
    public ExistingKeyException(String message) {
        super(message);
    }
}