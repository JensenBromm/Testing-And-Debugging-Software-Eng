public class Grader {


    public String gradeForScore(int score) {
        if (score < 60) return "F";
        if (score < 70) return "D";
        if (score < 80) return "C";
        if (score < 90) return "B";
        return "A";
    }
   
}
