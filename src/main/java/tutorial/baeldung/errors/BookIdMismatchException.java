package tutorial.baeldung.errors;

public class BookIdMismatchException extends RuntimeException {
    public BookIdMismatchException() {
        super("Book mistmatch");
    }
    
    public BookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}