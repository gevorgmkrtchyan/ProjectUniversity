package exceptions;

public class NullStudentException extends RuntimeException {
    @Override
    public String toString() {
        return "Group doesn't have student";
    }
}
