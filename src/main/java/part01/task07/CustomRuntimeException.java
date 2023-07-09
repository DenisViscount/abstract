package part01.task07;

public class CustomRuntimeException extends RuntimeException {
    public CustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

}
