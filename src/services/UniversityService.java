package services;

import classes.University;

public class UniversityService {
    University university = University.getUniversity();

    public void printUniversity() {
        university.setFaculties(new FacultyService().faculties);
        System.out.println("University name --> " + university.getUniversityName());
        new FacultyService().printFaculty();
        new LogicServiceForGroups().printAverageScoreForEachSubjectInGroup();
        new FacultyService().averageForFaculty1(new StudentService().studentsGroup1()[0].getSubjects());
        new FacultyService().averageForFaculty2(new StudentService().studentsGroup3()[0].getSubjects());
    }

}
