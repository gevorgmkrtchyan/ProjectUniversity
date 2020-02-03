package classes;

import exceptions.ScoreException;
import exceptions.SubjectException;

public class Student {
    private String name;
    private int[] scores = new int[5];
    private String[] subjects = new String[5];

    public Student(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) throws ScoreException {
        for (int score : scores) {
            if (score > 10 || score < 0) {
                throw new ScoreException();
            }
        }
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) throws SubjectException {
      if (subjects == null) throw new SubjectException("Subjects can not be null.");
      if (subjects.length == 0) throw new SubjectException("The student must have at least one subject.");
      ifSubjectIsNull(subjects);
        this.subjects = subjects;
    }
    private static void ifSubjectIsNull(String[] subjects){
        for (String subject : subjects) {
            if (subject == null) throw new SubjectException("Has been found null element");
        }
    }

    public int[] getScores() {
        return scores;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }
}
