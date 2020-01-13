package services;

import classes.Faculty;
import classes.Group;

import static services.StudentService.*;
import static services.UniversityService.university;

public class FacultyService {
    static Faculty faculty1 = new Faculty("RadioTechnologies");
    static Faculty faculty2 = new Faculty("Web Designers");
    static Faculty[] faculties = {faculty1, faculty2};

    public static void printFaculty() {
        faculty1.setGroups(new Group[]{GroupService.g1, GroupService.g2});
        faculty2.setGroups(new Group[]{GroupService.g3, GroupService.g4});
        System.out.println(("There are " + faculties.length + " faculties in " + university.getUniversityName())
                + ("\n" + "Faculty name is --> " + faculty1.getFacultyName())
                + ("\n" + "Faculty name is --> " + faculty2.getFacultyName()));
        GroupService.printGroups();
    }

    public static void averageForFaculty1(String[] subjectName) {
        //This function has disadvantages: There are code lines which are correct only for specific cases.
        System.out.println("==================================================");
        String[] s1 = studentsGroup1()[0].getSubjects();
        String[] s2 = studentsGroup2()[0].getSubjects();
        int index = 0;
        int[] arr = new int[3];
        double sum = 0.0;

        for (int i = 0; i < s1.length - 2; i++) {
            for (int j = 0; j < s1.length; j++) {
                for (int k = 0; k < 3; k++) {
                    if (subjectName[i].equals(s2[j])) {
                        index = j;
                        arr[k] = studentsGroup2()[k].getScores()[index] + studentsGroup1()[k].getScores()[index];
                        sum += arr[k];
                    }
                }

            }

        }
        System.out.println(s1[0] + " is mutual for " + faculty1.getFacultyName());
        System.out.println("average score of " + subjectName[0] + " in " + faculty1.getFacultyName() + " is " + sum / 6);


    }

    public static void averageForFaculty2(String[] subjectName) {
        //This function has disadvantages: There are code lines which are correct only for specific cases.
        System.out.println("==================================================");
        String[] s1 = studentsGroup3()[0].getSubjects();
        String[] s2 = studentsGroup4()[0].getSubjects();
        int index;
        int[] arr = new int[6];
        double sum = 0.0;

        for (int i = 0; i < s1.length - 2; i++) {
            for (int j = 0; j < s1.length; j++) {
                for (int k = 0; k < 3; k++) {

                    if (subjectName[i].equals(s2[j])) {
                        index = j;
                        arr[k] = studentsGroup3()[k].getScores()[index] + studentsGroup4()[k].getScores()[index];
                        sum += arr[k];

                    }


                }

            }

        }

        System.out.println(s1[0] + " is mutual for " + faculty2.getFacultyName());
        System.out.println("average score of " + subjectName[0] + " in " + faculty2.getFacultyName() + " is " + sum / 6);
    }

}
