package services;

import classes.Group;

import static services.FacultyService.faculty1;
import static services.FacultyService.faculty2;
import static services.StudentService.*;

public class GroupService {
    static Group g1 = new Group("R716");
    static Group g2 = new Group("R707");
    static Group g3 = new Group("H734");
    static Group g4 = new Group("H787");

    public static void printGroups() {
        g1.setStudents(studentsGroup1());
        g2.setStudents(studentsGroup2());
        g3.setStudents(studentsGroup3());
        g4.setStudents(studentsGroup4());
        System.out.println("\n" + "Group name is --> " + g1.getGroupName() + ", belongs " + faculty1.getFacultyName() + "\n");
        printStudentList1();
        System.out.println("\n" + "Group name is --> " + g2.getGroupName() + ", belongs " + faculty1.getFacultyName() + "\n");
        printStudentList2();
        System.out.println("\n" + "Group name is --> " + g3.getGroupName() + " Belongs " + faculty2.getFacultyName() + "\n");
        printStudentList3();
        System.out.println("\n" + "Group name is --> " + g4.getGroupName() + " Belongs " + faculty2.getFacultyName() + "\n");
        printStudentList4();
    }

}
