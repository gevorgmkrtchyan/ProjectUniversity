package exceptions;

public class ScoreException extends RuntimeException {
    @Override
    public String toString() {
        return "Score range must be [0:10]";
    }
}
