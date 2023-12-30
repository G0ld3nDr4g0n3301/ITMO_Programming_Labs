package exceptions;

public class BasketVolumeExceededException extends RuntimeException {
    public BasketVolumeExceededException(String message) {
        super(message);
    }
}