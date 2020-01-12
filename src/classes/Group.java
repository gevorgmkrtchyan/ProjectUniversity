package classes;

public class Group {
    private String groupName;
    private Student students[] = new Student[10];

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }


    public void setStudents(Student[] students)throws Exception {
        if (students == null){
            throw new Exception("group doesn't have students");
        }
        this.students = students;
    }
}
