package Pratice2.Bai2;

import Collection.Bai2.Product;

import java.util.*;

public class StudentService {
    private final Map<String, Student> studentIntegerMap = new HashMap<>();

    public void insertStudent(Student studentInput) {
        if (studentInput == null) {
            return;
        }
        Student student = studentIntegerMap.get(studentInput.getStudentId());
        studentIntegerMap.put(studentInput.getStudentId(), studentInput);
    }

    public Student findStudent(String studentId) {
        if (studentId == null) {
            return null;
        }
        return studentIntegerMap.get(studentId);
    }

    public void updateScore(String studentId, double mathScore, double englishScore, double computerScore, double averageScore) {
        if (studentId == null) {
            return;
        }
        Student student = studentIntegerMap.get(studentId);
        student.setMathScore(mathScore);
        student.setEnglishScore(englishScore);
        student.setComputerScore(computerScore);
        student.setAverageScore(averageScore);
        studentIntegerMap.put(studentId, student);
    }

    public void sortAverageScoreRaise() {
        List<Student> studentList = new ArrayList<>(studentIntegerMap.values());
        studentList.sort(Comparator.comparingDouble(Student::getAverageScore));
        System.out.println("Sap xep theo tang dan" +studentList);
    }
    public void sortAverageScoreReduce() {
        List<Student> studentList = new ArrayList<>(studentIntegerMap.values());
        studentList.sort(Comparator.comparingDouble(Student::getAverageScore).reversed());
        System.out.println("Sap xep theo giam dan" +studentList);
    }

    public void findStudenScore(String studentId, double averageScore) {

    }


}
