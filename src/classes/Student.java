package classes;

public class Student {
    private String name;
    private int[] scores = new int[5];
    private String subjects[] = new String[5];

    public Student(String name) {
        this.name = name;
    }

    public void setScores(int[] scores)throws Exception {

        for (int i = 0; i <scores.length ; i++) {
            if (scores == null || scores[i] > 10 || scores[i] < 0)
                throw new Exception("null");
        }
        this.scores = scores;

    }

    public void setSubjects(String[] subjects) throws Exception{

        if (subjects == null  || subjects.length == 0 ){
            throw new Exception("null");
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
