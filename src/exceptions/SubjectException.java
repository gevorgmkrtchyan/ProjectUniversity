package exceptions;

public class SubjectException extends RuntimeException {
    @Override
    public String toString() {
        return "Subject wasn't selected";
    }
}
