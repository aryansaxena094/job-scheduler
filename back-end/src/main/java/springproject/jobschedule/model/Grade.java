package springproject.jobschedule.model;

public class Grade {
    private GradeScale grade;
    public Grade(GradeScale grade) {
        this.grade = grade;
    }
    public String getLetterGrade() {
        return grade.getLetter();
    }
    public double getCreditPoints() {
        return grade.getPoints();
    }
    public GradeScale getGrade() {
        return grade;
    }
    public void setGrade(GradeScale grade) {
        this.grade = grade;
    }
    public enum GradeScale {
        A_PLUS("A+", 4.3),
        A("A", 4.0),
        A_MINUS("A-", 3.8),
        B_PLUS("B+", 3.5),
        B("B", 3.3),
        B_MINUS("B-", 3.0),
        C("C", 2.0),
        F("F", 0.0);

        private final String letter;
        private final double points;

        GradeScale(String letter, double points) {
            this.letter = letter;
            this.points = points;
        }

        public String getLetter() {
            return letter;
        }

        public double getPoints() {
            return points;
        }
    }
}
