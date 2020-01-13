package services;

import classes.Student;

import static services.GroupService.*;
import static services.StudentService.*;
import static services.StudentService.students4;

public class LogicServiceForGroups {
    public static void averageScoreForFirstSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[0];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[0].getSubjects()[0]
                + " in " + groupName + " is " + average);

    }

    private static void averageScoreForSecondSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[1];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[1].getSubjects()[1]
                + " in " + groupName + " is " + average);
    }

    private static void averageScoreForThirdSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[2];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[2].getSubjects()[2]
                + " in " + groupName + " is " + average);
    }

    private static void averageScoreForForthSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[3];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[2].getSubjects()[3]
                + " in " + groupName + " is " + average);

    }

    public static void printAverageScoreForEachSubjectInGroup() {
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(students1, g1.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(students1, g1.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(students1, g1.getGroupName());
        averageScoreForForthSubjectInFirstGroup(students1, g1.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(students2, g2.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(students2, g2.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(students2, g2.getGroupName());
        averageScoreForForthSubjectInFirstGroup(students2, g2.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(students3, g3.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(students3, g3.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(students3, g3.getGroupName());
        averageScoreForForthSubjectInFirstGroup(students3, g3.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(students4, g4.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(students4, g4.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(students4, g4.getGroupName());
        averageScoreForForthSubjectInFirstGroup(students4, g4.getGroupName());
    }

}
