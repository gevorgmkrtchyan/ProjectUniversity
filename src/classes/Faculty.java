package classes;

import exceptions.NullGroupException;

public class Faculty {
    private String facultyName;
    private Group[] groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;

    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups) throws NullGroupException {
        if (groups == null || groups.length == 0) {
            throw new NullGroupException();
        }
        this.groups = groups;
    }
}
