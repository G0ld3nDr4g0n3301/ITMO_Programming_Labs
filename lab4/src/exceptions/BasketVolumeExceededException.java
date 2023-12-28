package exceptions;

public class BasketVolumeExceededException extends Exception{
    public BasketVolumeExceededException(String message){
        super(message);
    }
}