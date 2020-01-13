package classes;

import exceptions.NullStudentException;

public class Group {
    private String groupName;
    private Student students[] = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }


    public void setStudents(Student[] students) throws NullStudentException {
        if (students == null || students.length == 0){
            throw new NullStudentException();
        }
        this.students = students;
    }
}
