package services;

import classes.Student;
import exceptions.SubjectException;

import java.util.Arrays;

public class StudentService {
    static Student[] students1;
    static Student[] students2;
    static Student[] students3;
    static Student[] students4;


    public static Student[] studentsGroup1() {
        Student s1 = new Student("Aram");
        s1.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s1.setScores(new int[]{9, 5, 4, 6});
        Student s2 = new Student("Gevorg");
        s2.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s2.setScores(new int[]{9, 8, 8, 8});
        Student s3 = new Student("Karen");
        s3.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s3.setScores(new int[]{9, 7, 7, 7});
        students1 = new Student[]{s1, s2, s3};
        return students1;
    }

    static Student[] studentsGroup2() {
        Student s4 = new Student("Anna");
        s4.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        s4.setScores(new int[]{9, 9, 9, 5});
        Student s5 = new Student("Ani");
        s5.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        s5.setScores(new int[]{4, 9, 4, 8});
        Student s6 = new Student("Vahan");
        s6.setSubjects(new String[]{"JS", "Java", "C++", "Scala"});
        s6.setScores(new int[]{7, 9, 9, 7});
        students2 = new Student[]{s4, s5, s6};
        return students2;
    }

    public /*չ*/ static Student[] studentsGroup3() {

        Student s7 = new Student("David");
        s7.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s7.setScores(new int[]{6, 8, 6, 10});
        Student s8 = new Student("Mary");
        s8.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s8.setScores(new int[]{6, 4, 2, 7});
        Student s9 = new Student("John");
        s9.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s9.setScores(new int[]{9, 3, 7, 4});
        students3 = new Student[]{s7, s8, s9};
        return students3;
    }

    static Student[] studentsGroup4() {

        Student s10 = new Student("Nare");
        s10.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s10.setScores(new int[]{5, 10, 9, 3});
        Student s11 = new Student("Mary");
        s11.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s11.setScores(new int[]{7, 8, 10, 5});
        Student s12 = new Student("John");
        s12.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s12.setScores(new int[]{4, 8, 2, 6});
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

    private static double printAverage(Student student) {
        int sum = 0;
        for (int i = 0; i < student.getScores().length; i++) {
            sum += student.getScores()[i];
        }
        return (double) sum / student.getScores().length;
    }
}
