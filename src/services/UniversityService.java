package services;


import classes.University;

import static services.FacultyService.*;
import static services.LogicServiceForGroups.printAverageScoreForEachSubjectInGroup;

public class UniversityService {
    static University university = University.getUniversity();
    public static void printUniversity() throws Exception {
        try {
            university.setFaculties(faculties);
        }catch (Exception e){
            System.out.println("University doesn't have faculties");
        }

        System.out.println("University name --> " + university.getUniversityName());
        FacultyService.printFaculty();
        printAverageScoreForEachSubjectInGroup();
        try{
            FacultyService.averageForFaculty1(StudentService.studentsGroup1()[0].getSubjects());
        }catch (Exception e){
            GroupService.exceptionForGroup();
        }

        FacultyService.averageForFaculty2(StudentService.studentsGroup3()[0].getSubjects());
    }

}
