package services;


import classes.University;

import static services.FacultyService.*;
import static services.LogicServiceForGroups.printAverageScoreForEachSubjectInGroup;

public class UniversityService {
    static University university = University.getUniversity();

    public static void printUniversity() {
        university.setFaculties(faculties);
        System.out.println("University name --> " + university.getUniversityName());
        FacultyService.printFaculty();
        printAverageScoreForEachSubjectInGroup();
        FacultyService.averageForFaculty1(StudentService.studentsGroup1()[0].getSubjects());
        FacultyService.averageForFaculty2(StudentService.studentsGroup3()[0].getSubjects());
    }

}
