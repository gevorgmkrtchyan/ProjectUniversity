package exceptions;

public class NullFacultyException extends RuntimeException {
    @Override
    public String toString() {
        return "University doesn't have faculties";
    }
}
