package classes;

public class University {
    //SINGLE TONE DESIGN PATTERN
    private static University university = new University("NPUA");

    public static University getUniversity(){
        return university;
    }

    private String universityName;
    Faculty[] faculties;

    private University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFaculties(Faculty[] faculties)throws Exception {
        if (faculties == null || faculties.length == 0){
            throw new Exception("University doesn't have faculties");
        }
        this.faculties = faculties;
    }
}
