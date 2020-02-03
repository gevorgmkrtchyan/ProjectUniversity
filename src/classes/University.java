package classes;

import exceptions.NullFacultyException;
import java.util.Arrays;

public class University {
    //SINGLE TONE DESIGN PATTERN
    private static University university = new University("NPUA");

    public static University getUniversity() {
        return university;
    }

    private String universityName;
    private Faculty[] faculties;

    private University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFaculties(Faculty[] faculties) throws NullFacultyException {
        if (faculties == null ) throw new NullFacultyException("Faculties can not be null.");
        if (faculties.length == 0) throw new NullFacultyException("There must be at least one faculty.");
        isUniversityContainsNullElement(faculties);
        this.faculties = faculties;
    }
    private static void isUniversityContainsNullElement(Faculty[] faculties){
        for (Faculty faculty : faculties) {
            if (faculty == null) throw new NullFacultyException("Has been found null element");
        }
    }
}
