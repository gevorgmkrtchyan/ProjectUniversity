package services;

import classes.Student;

import java.util.Arrays;

public class StudentService {
    static Student[] students1;
    static Student[] students2;
    static Student[] students3;
    static Student[] students4;
    static void messageForException(){
        System.out.println("Subjects were not initialized");
    }
    static void messageForUnCorrectScore(){
        System.out.println("invalid score");
    }


    public static Student[] studentsGroup1() {

        Student s1 = new Student("Aram");
        try {
            s1.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s1.setScores(new int[]{9, 5, 4, 6});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s2 = new Student("Gevorg");
        try {
            s2.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s2.setScores(new int[]{8, 8, 8, 8});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s3 = new Student("Karen");
        try {
            s3.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s3.setScores(new int[]{7, 7, 7, 7});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        students1 = new Student[]{s1,s2,s3};
        return students1;
    }

    static Student[] studentsGroup2() {

        Student s4 = new Student("Anna");
        try {
            s4.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s4.setScores(new int[]{9, 9, 9, 5});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s5 = new Student("Ani");
        try {
            s5.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s5.setScores(new int[]{4, 8, 4, 8});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s6 = new Student("Vahan");
        try {
            s6.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s6.setScores(new int[]{7, 9, 9, 7});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        students2 = new Student[]{s4, s5, s6};
        return students2;
    }

    public /*չ*/static Student[] studentsGroup3() {

        Student s7 = new Student("David");
        try {
            s7.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s7.setScores(new int[]{6, 8, 6, 1});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s8 = new Student("Mary");
        try {
            s8.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s8.setScores(new int[]{6, 4, 2, 7});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s9 = new Student("John");
        try {
            s9.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s9.setScores(new int[]{9, 3, 7, 4});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        students3 = new Student[]{s7, s8, s9};
        return students3;
    }

    static Student[] studentsGroup4() {

        Student s10 = new Student("Nare");
        try {
            s10.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s10.setScores(new int[]{5, 10, 9, 3});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s11 = new Student("Mary");
        try {
            s11.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s11.setScores(new int[]{7, 8, 10, 5});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        Student s12 = new Student("John");
        try {
            s12.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        } catch (Exception e) {
            messageForException();
        }
        try {
            s12.setScores(new int[]{4, 8, 2, 6});
        } catch (Exception e) {
            messageForUnCorrectScore();
        }
        students4 = new Student[]{s10, s11, s12};
        return students4;
    }

    static void printStudentList1() {
        for (Student student : students1) {
            System.out.print(student.getName() + " ");
            System.out.print(Arrays.toString(student.getSubjects()) + " ");
            System.out.print(Arrays.toString(student.getScores()) + " ");
            System.out.println("Average score for " + student.getName() + " is " + printAverage(student));
        }
    }

    static void printStudentList2() {
        for (Student student : students2) {
            System.out.print(student.getName() + " ");
            System.out.print(Arrays.toString(student.getSubjects()) + " ");
            System.out.print(Arrays.toString(student.getScores()));
            System.out.println("Average score for " + student.getName() + " is " + printAverage(student));
        }
    }

    static void printStudentList3() {
        for (Student student : students3) {
            System.out.print(student.getName() + " ");
            System.out.print(Arrays.toString(student.getSubjects()) + " ");
            System.out.print(Arrays.toString(student.getScores()));
            System.out.println("Average score for " + student.getName() + " is " + printAverage(student));
        }
    }

    static void printStudentList4() {
        for (Student student : students4) {
            System.out.print(student.getName() + " ");
            System.out.print(Arrays.toString(student.getSubjects()) + " ");
            System.out.print(Arrays.toString(student.getScores()));
            System.out.println("Average score for " + student.getName() + " is " + printAverage(student));
        }
    }
    private static double printAverage(Student student){
        int sum = 0;
        for (int i = 0; i < student.getScores().length ; i++) {
            sum += student.getScores()[i];
        }
        return (double)sum/student.getScores().length;
    }
}
