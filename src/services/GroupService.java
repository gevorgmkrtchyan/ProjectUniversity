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
    static void exceptionForGroup(){
        System.out.println("Group doesn't have students");
    }
    public static void printGroups(){
        try {
            g1.setStudents(studentsGroup1());
        } catch (Exception e) {
            exceptionForGroup();
        }
        try {
            g2.setStudents(studentsGroup2());
        } catch (Exception e) {
            exceptionForGroup();
        }
        try {
            g3.setStudents(studentsGroup3());
        } catch (Exception e) {
            exceptionForGroup();
        }
        try {
            g4.setStudents(studentsGroup4());
        } catch (Exception e) {
            exceptionForGroup();
        }
        System.out.println("\n" + "Group name is --> " + g1.getGroupName() + ", belongs " + faculty1.getFacultyName() + "\n");
        printStudentList1();
        System.out.println("\n" +"Group name is --> " + g2.getGroupName() + ", belongs " + faculty1.getFacultyName() + "\n");
        printStudentList2();
        System.out.println("\n" +"Group name is --> " + g3.getGroupName() + " Belongs " + faculty2.getFacultyName() + "\n");
        printStudentList3();
        System.out.println("\n" +"Group name is --> " + g4.getGroupName() + " Belongs " + faculty2.getFacultyName() + "\n");
        printStudentList4();
    }

}
