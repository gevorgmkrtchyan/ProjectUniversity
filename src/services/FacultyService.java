package services;

import classes.Faculty;
import classes.Group;
import classes.University;

class FacultyService {
    Faculty faculty1 = new Faculty("RadioTechnologies");
    Faculty faculty2 = new Faculty("Web Designers");
    Faculty[] faculties = {faculty1,faculty2};

   void printFaculty() {
        faculty1.setGroups(new Group[]{new GroupService().g1, new GroupService().g2});
        faculty2.setGroups(new Group[]{new GroupService().g3, new GroupService().g4});
        System.out.println(("There are " + faculties.length + " faculties in " + University.getUniversity().getUniversityName())
                + ("\n" + "Faculty name is --> " + faculty1.getFacultyName())
                + ("\n" + "Faculty name is --> " + faculty2.getFacultyName()));
        new GroupService().printGroups();
    }
}
