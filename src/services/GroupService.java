package services;

import classes.Group;

class GroupService {
     Group g1 = new Group("R716");
     Group g2 = new Group("R707");
     Group g3 = new Group("H734");
     Group g4 = new Group("H787");

     void printGroups() {
        g1.setStudents(new StudentService().studentsGroup1());
        g2.setStudents(new StudentService().studentsGroup2());
        g3.setStudents(new StudentService().studentsGroup3());
        g4.setStudents(new StudentService().studentsGroup4());
        System.out.println("\n" + "Group name is --> " + g1.getGroupName() + ", belongs " + new FacultyService().faculty1.getFacultyName() + "\n");
        new StudentService().printStudnetList(g1.getStudents());
        System.out.println("\n" + "Group name is --> " + g2.getGroupName() + ", belongs " + new FacultyService().faculty1.getFacultyName() + "\n");
        new StudentService().printStudnetList(g2.getStudents());
        System.out.println("\n" + "Group name is --> " + g3.getGroupName() + " belongs " + new FacultyService().faculty2.getFacultyName() + "\n");
        new StudentService().printStudnetList(g3.getStudents());
        System.out.println("\n" + "Group name is --> " + g4.getGroupName() + " belongs " + new FacultyService().faculty2.getFacultyName() + "\n");
        new StudentService().printStudnetList(g4.getStudents());
    }

}
