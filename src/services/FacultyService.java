package services;

import classes.Faculty;
import classes.Group;
import classes.University;

public class FacultyService {
    Faculty faculty1 = new Faculty("RadioTechnologies");
    Faculty faculty2 = new Faculty("Web Designers");
    Faculty[] faculties = {faculty1, faculty2};

    public void printFaculty() {
        faculty1.setGroups(new Group[]{new GroupService().g1, new GroupService().g2});
        faculty2.setGroups(new Group[]{new GroupService().g3, new GroupService().g4});
        System.out.println(("There are " + faculties.length + " faculties in " + University.getUniversity().getUniversityName())
                + ("\n" + "Faculty name is --> " + faculty1.getFacultyName())
                + ("\n" + "Faculty name is --> " + faculty2.getFacultyName()));
        new GroupService().printGroups();
    }

    public void averageForFaculty1(String[] subjectName) {
        //This function has disadvantages: There are code lines which are correct only for specific cases.
        System.out.println("==================================================");

        int index;
        int[] arr = new int[4];
        double sum = 0.0;
        String message = "";
        for (int i = 0; i < new StudentService().studentsGroup1().length; i++) {
            for (int j = 0; j < new StudentService().studentsGroup1()[0].getScores().length - 1; j++) {
                for (int k = 0; k < new StudentService().studentsGroup1().length; k++) {
                    String[] s1 = new StudentService().studentsGroup1()[i].getSubjects();
                    String[] s2 = new StudentService().studentsGroup2()[i].getSubjects();

                    if (subjectName[i].equals(s2[j])) {
                        index = j;
                        arr[k] = new StudentService().studentsGroup2()[index].getScores()[index] + new StudentService().studentsGroup1()[k].getScores()[index];
                        sum += arr[k];
                        message = s1[i] + " is mutual for " + faculty1.getFacultyName();
                    }
                }
            }
        }
        System.out.println(message);
        System.out.println("average score of " + subjectName[0] + " in " + faculty1.getFacultyName() + " is " + sum / 6);


    }


    public void averageForFaculty2(String[] subjectName) {
        //This function has disadvantages: There are code lines which are correct only for specific cases.
        System.out.println("==================================================");
        String[] s1 = new StudentService().studentsGroup3()[0].getSubjects();
        String[] s2 = new StudentService().studentsGroup4()[0].getSubjects();
        int index;
        int[] arr = new int[6];
        double sum = 0.0;

        for (int i = 0; i < s1.length - 2; i++) {
            for (int j = 0; j < s1.length; j++) {
                for (int k = 0; k < 3; k++) {

                    if (subjectName[i].equals(s2[j])) {
                        index = j;
                        arr[k] = new StudentService().studentsGroup3()[k].getScores()[index] + new StudentService().studentsGroup4()[k].getScores()[index];
                        sum += arr[k];
                    }
                }
            }
        }
        System.out.println(s1[0] + " is mutual for " + faculty2.getFacultyName());
        System.out.println("average score of " + subjectName[0] + " in " + faculty2.getFacultyName() + " is " + sum / 6);
    }

}
