package exceptions;

public class NullGroupException extends RuntimeException {
    @Override
    public String toString() {
        return "Faculty doesn't have group";
    }
}
