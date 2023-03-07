package Practice4.Bai2;

import java.util.Random;
import java.util.stream.IntStream;

public class Student {
    private int studentId = 1 ;
    private String name ;
    private int score  ;

    public Student() {
        studentId++;
    }

    public Student(int studentId, String name, int score) {
        this.studentId = studentId++;
        this.name = name;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
