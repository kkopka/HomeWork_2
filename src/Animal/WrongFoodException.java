package Animal;

public class WrongFoodException extends Exception  {

    public WrongFoodException() {
        super();
    }

    public WrongFoodException(String message) {
        super(message);
    }

    public WrongFoodException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongFoodException(Throwable cause) {
        super(cause);
    }

    protected WrongFoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
