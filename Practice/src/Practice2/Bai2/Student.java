package Practice2.Bai2;

public class Student {
    private String studentId;
    private String studentName;
    private double mathScore;
    private double englishScore;
    private double computerScore;
    private double averageScore = (mathScore + englishScore +computerScore ) / 3 ;

    public Student(String studentId, String studentName, double mathScore, double englishScore, double computerScore, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.computerScore = computerScore;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(double computerScore) {
        this.computerScore = computerScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", mathScore=" + mathScore +
                ", englishScore=" + englishScore +
                ", computerScore=" + computerScore +
                ", averageScore=" + averageScore +
                '}';
    }
}
