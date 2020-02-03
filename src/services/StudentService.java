package services;

import classes.Student;
import java.util.Arrays;

 class StudentService {
     Student[] studentsGroup1() {
        Student s1 = new Student("Aram");
        s1.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s1.setScores(new int[]{9, 5, 4, 6});
        Student s2 = new Student("Gevorg");
        s2.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s2.setScores(new int[]{9, 8, 8, 8});
        Student s3 = new Student("Karen");
        s3.setSubjects(new String[]{"Java", "SQL", "Git", "DOM"});
        s3.setScores(new int[]{9, 7, 7, 7});
        return new Student[]{s1, s2, s3};
    }

     Student[] studentsGroup2() {
        Student s4 = new Student("Anna");
        s4.setSubjects(new String[]{"Java", "JS", "C++", "Scala"});
        s4.setScores(new int[]{9, 9, 9, 5});
        Student s5 = new Student("Ani");
        s5.setSubjects(new String[]{"Java", "JS", "C++", "Scala"});
        s5.setScores(new int[]{4, 9, 4, 8});
        Student s6 = new Student("Vahan");
        s6.setSubjects(new String[]{"Java", "JS", "C++", "Scala"});
        s6.setScores(new int[]{7, 9, 9, 7});
         return new Student[]{s4, s5, s6};
    }

     Student[] studentsGroup3() {
        Student s7 = new Student("David");
        s7.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s7.setScores(new int[]{6, 8, 6, 10});
        Student s8 = new Student("Mary");
        s8.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s8.setScores(new int[]{6, 4, 2, 7});
        Student s9 = new Student("John");
        s9.setSubjects(new String[]{"English", "HTML", "CSS", "JS"});
        s9.setScores(new int[]{9, 3, 7, 4});
         return new Student[]{s7, s8, s9};
    }

     Student[] studentsGroup4() {
        Student s10 = new Student("Nare");
        s10.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s10.setScores(new int[]{5, 10, 9, 3});
        Student s11 = new Student("Mary");
        s11.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s11.setScores(new int[]{7, 8, 10, 5});
        Student s12 = new Student("John");
        s12.setSubjects(new String[]{"English", "DOM", "jQuery", "Bootstrap"});
        s12.setScores(new int[]{4, 8, 2, 6});
         return new Student[]{s10, s11, s12};
    }

    void printStudnetList(Student[] students){
    for (Student student : students) {
        System.out.print(student.getName() + " ");
        System.out.print(Arrays.toString(student.getSubjects()) + " ");
        System.out.print(Arrays.toString(student.getScores()) + " ");
        System.out.println("Average score for " + student.getName() + " is " + printAverage(student));
    }

}
    private  double printAverage(Student student) {
        int sum = 0;
        for (int i = 0; i < student.getScores().length; i++) {
            sum += student.getScores()[i];
        }
        return (double) sum / student.getScores().length;
    }
}
