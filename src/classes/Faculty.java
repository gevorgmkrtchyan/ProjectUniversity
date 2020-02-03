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
       if (groups == null) throw new NullGroupException("Groups can not be null");
       if (groups.length == 0) throw new NullGroupException("The faculty must have at least one group");
       isFacultyContainsNullElement(groups);
        this.groups = groups;
    }
private static void isFacultyContainsNullElement(Group[] groups){
    for (Group group : groups) {
        if (group == null) throw new NullGroupException("Has been found null element");
    }
}
}
