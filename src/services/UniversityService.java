package services;

import classes.University;

public class UniversityService {
    University university = University.getUniversity();

    public void printUniversity() {
        university.setFaculties(new FacultyService().faculties);
        System.out.println("University name --> " + university.getUniversityName());
        new FacultyService().printFaculty();
        new LogicServiceForGroups().printAverageScoreForEachSubjectInGroup();
    }

}
