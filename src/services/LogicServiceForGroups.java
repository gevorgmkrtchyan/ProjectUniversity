package services;

import classes.Student;



class LogicServiceForGroups {
    private void averageScoreForGroup(Student[] students, String groupName, int subjectIndex)throws Exception{
        if (subjectIndex >= 4)throw new Exception("Invalid Subject Index");
               int sum = 0;
            for (Student student : students) {
                sum += student.getScores()[subjectIndex];
            }
            double average = (double) sum / students.length;
            System.out.println("Average score for subject " + students[0].getSubjects()[subjectIndex]
                    + " in " + groupName + " is " + average);
        }


    void printAverageScoreForEachSubjectInGroup() throws Exception {
        System.out.println("=========================================================");
        averageScoreForGroup(new StudentService().studentsGroup1(),new GroupService().g1.getGroupName(),0);
        averageScoreForGroup(new StudentService().studentsGroup1(),new GroupService().g1.getGroupName(),1);
        averageScoreForGroup(new StudentService().studentsGroup1(),new GroupService().g1.getGroupName(),2);
        averageScoreForGroup(new StudentService().studentsGroup1(),new GroupService().g1.getGroupName(),3);
        System.out.println("=========================================================");
        averageScoreForGroup(new StudentService().studentsGroup2(),new GroupService().g2.getGroupName(),0);
        averageScoreForGroup(new StudentService().studentsGroup2(),new GroupService().g2.getGroupName(),1);
        averageScoreForGroup(new StudentService().studentsGroup2(),new GroupService().g2.getGroupName(),2);
        averageScoreForGroup(new StudentService().studentsGroup2(),new GroupService().g2.getGroupName(),3);
        System.out.println("=========================================================");
        averageScoreForGroup(new StudentService().studentsGroup3(),new GroupService().g3.getGroupName(),0);
        averageScoreForGroup(new StudentService().studentsGroup3(),new GroupService().g3.getGroupName(),1);
        averageScoreForGroup(new StudentService().studentsGroup3(),new GroupService().g3.getGroupName(),2);
        averageScoreForGroup(new StudentService().studentsGroup3(),new GroupService().g3.getGroupName(),3);
        System.out.println("=========================================================");
        averageScoreForGroup(new StudentService().studentsGroup4(),new GroupService().g4.getGroupName(),0);
        averageScoreForGroup(new StudentService().studentsGroup4(),new GroupService().g4.getGroupName(),1);
        averageScoreForGroup(new StudentService().studentsGroup4(),new GroupService().g4.getGroupName(),2);
        averageScoreForGroup(new StudentService().studentsGroup4(),new GroupService().g4.getGroupName(),3);
    }

}
