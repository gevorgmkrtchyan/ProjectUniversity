package classes;

public class Faculty {
    private String facultyName;
    private Group[] groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;

    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups)throws Exception {
        this.groups = groups;
        if (groups == null || groups.length == 0){
            throw  new Exception("null");
        }
    }
}
