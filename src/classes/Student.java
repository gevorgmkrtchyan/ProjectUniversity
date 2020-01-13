package classes;

import exceptions.ScoreException;
import exceptions.SubjectException;

public class Student {
    private String name;
    private int[] scores = new int[5];
    private String subjects[] = new String[5];

    public Student(String name) {
        this.name = name;
    }

    public void setScores(int[] scores) throws ScoreException {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 10 || scores[i] < 0) {
                throw new ScoreException();
            }
        }
        this.scores = scores;
    }

    public void setSubjects(String[] subjects) throws SubjectException {
        if (subjects == null || subjects.length == 0) {
            throw new SubjectException();
        }
        this.subjects = subjects;
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
