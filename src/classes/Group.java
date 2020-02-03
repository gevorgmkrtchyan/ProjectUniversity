package classes;

import exceptions.NullStudentException;

public class Group {
    private String groupName;
    private Student[] students = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) throws NullStudentException {
      if (students == null) throw new NullStudentException("Students can not be null.");
      if (students.length == 0) throw new NullStudentException("TheGroup must have at least one student.");
      isGroupContainsNullElement(students);
        this.students = students;
    }
    private static void isGroupContainsNullElement(Student[] students){
        for (Student student : students) {
            if (student == null) throw new NullStudentException("Has been found null element");
        }
    }
}
