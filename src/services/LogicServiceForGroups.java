package services;

import classes.Student;



public class LogicServiceForGroups {
    public void averageScoreForFirstSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[0];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[0].getSubjects()[0]
                + " in " + groupName + " is " + average);
    }

    private  void averageScoreForSecondSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[1];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[1].getSubjects()[1]
                + " in " + groupName + " is " + average);
    }

    private  void averageScoreForThirdSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[2];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[2].getSubjects()[2]
                + " in " + groupName + " is " + average);
    }

    private  void averageScoreForForthSubjectInFirstGroup(Student[] students, String groupName) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getScores()[3];
        }
        double average = (double) sum / students.length;
        System.out.println("Average score for subject " + students[2].getSubjects()[3]
                + " in " + groupName + " is " + average);

    }

    public  void printAverageScoreForEachSubjectInGroup() {
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(new StudentService().studentsGroup1(), new GroupService().g1.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(new StudentService().studentsGroup1(), new GroupService().g1.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(new StudentService().studentsGroup1(), new GroupService().g1.getGroupName());
        averageScoreForForthSubjectInFirstGroup(new StudentService().studentsGroup1(), new GroupService().g1.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(new StudentService().studentsGroup2(), new GroupService().g2.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(new StudentService().studentsGroup2(), new GroupService().g2.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(new StudentService().studentsGroup2(), new GroupService().g2.getGroupName());
        averageScoreForForthSubjectInFirstGroup(new StudentService().studentsGroup2(), new GroupService().g2.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(new StudentService().studentsGroup3(), new GroupService().g3.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(new StudentService().studentsGroup3(), new GroupService().g3.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(new StudentService().studentsGroup3(), new GroupService().g3.getGroupName());
        averageScoreForForthSubjectInFirstGroup(new StudentService().studentsGroup3(), new GroupService().g3.getGroupName());
        System.out.println("--------------------------------------------------\n");
        averageScoreForFirstSubjectInFirstGroup(new StudentService().studentsGroup4(), new GroupService().g4.getGroupName());
        averageScoreForSecondSubjectInFirstGroup(new StudentService().studentsGroup4(), new GroupService().g4.getGroupName());
        averageScoreForThirdSubjectInFirstGroup(new StudentService().studentsGroup4(), new GroupService().g4.getGroupName());
        averageScoreForForthSubjectInFirstGroup(new StudentService().studentsGroup4(), new GroupService().g4.getGroupName());
    }

}
