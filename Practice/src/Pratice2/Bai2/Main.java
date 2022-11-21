package Pratice2.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            menu();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    doInsertStudent(studentService);
                    break;
                case 2:
                    doFindStudent(studentService);
                    break;
                case 3:
                    doUpdateStudent(studentService);
                    break;
                case 4:
                    doSortAverageScoreraise(studentService);

                    break;
               case 5 :
                   doSortAverageScorereduce(studentService);
                    break;
//                case 6 :
//                    break;
                default:
                    System.exit(0);
                    break;

            }
        } while (true);
    }

    private static void doSortAverageScorereduce(StudentService studentService) {
        studentService.sortAverageScoreReduce();
    }

    private static void doSortAverageScoreraise(StudentService studentService) {
        studentService.sortAverageScoreRaise();
    }

    private static void doUpdateStudent(StudentService studentService) {
        System.out.println("Nhap sinh vien can update");
        String studentId = new Scanner(System.in).nextLine();
        System.out.println("Nhap diem toan can update");
        double mathScore = new Scanner(System.in).nextDouble();
        System.out.println("Nhap diem anh can update");
        double englishScore = new Scanner(System.in).nextDouble();
        System.out.println("Nhap diem tin can update");
        double computerScore = new Scanner(System.in).nextDouble();
        double average = Math.ceil((mathScore + englishScore + computerScore) / 3);
        studentService.updateScore(studentId, mathScore, englishScore, computerScore, average);
    }

    private static void doFindStudent(StudentService studentService) {
        System.out.println("Nhap sinh vien can tim kiem");
        String s = new Scanner(System.in).nextLine();
        Student student = studentService.findStudent(s);
        if (student == null) {
            System.out.println("Khong tim thay sinh vien");
        } else {
            System.out.println(student);
        }
    }

    private static void doInsertStudent(StudentService studentService) {
        System.out.println("Nhap thong tin sinh vien :");
        System.out.println("Nhap ma sinh vien");
        String studentId = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten sinh vien ");
        String studentName = new Scanner(System.in).nextLine();
        System.out.println("Nhap diem toan");
        double mathScore = new Scanner(System.in).nextDouble();
        System.out.println("Nhap diem anh");
        double englishScore = new Scanner(System.in).nextDouble();
        System.out.println("Nhap diem tin");
        double computerScore = new Scanner(System.in).nextDouble();
        double average = Math.ceil((mathScore + englishScore + computerScore) / 3);
        Student student = new Student(studentId, studentName, mathScore, englishScore, computerScore, average);
        studentService.insertStudent(student);
        System.out.println(student);
    }


    public static void menu() {
        System.out.println("===Menu===");
        System.out.println(" 1. Them sinh vien");
        System.out.println("2. Tim kiem sinh vien theo msv");
        System.out.println("3. Update diem sinh vien");
        System.out.println("4. Sap xep sinh vien theo diem so (be den lon");
        System.out.println("5. Sap xep sinh vien theo diem so tu lon den be");

    }

}
