package Practice4.Bai2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        IntStream.range(0, 1000).forEach(value -> {
            int score = new Random().nextInt(10) + 1;
            Student student = new Student();
            student.setStudentId(value);
            student.setName(UUID.randomUUID().toString());
            student.setScore(score);
            studentList.add(student);
        });
        System.out.println(studentList);
        System.out.println("Danh sach sinh vien co diem kha la :" + studentList.stream().filter(score -> score.getScore() >= 6 && score.getScore() < 8).collect(Collectors.toList()));
        List<Student> studentList1 = studentList.stream().filter(score -> score.getScore() >= 8).sorted(Comparator.comparing(Student::getScore).reversed()).collect(Collectors.toList());
        System.out.println("Danh sach sinh vien co diem gioi la :" + studentList1);

        System.out.println("3 sinh vien co diem cao nhat la " + studentList1.stream().limit(3).collect(Collectors.toList()));

        List<Student> studentList2 = studentList.stream().filter(score -> score.getScore() < 6).collect(Collectors.toList());
        System.out.println("Danh sach sinh vien can cai thien diem la :" + studentList2);
        System.out.println("10 sinh vien can cai thien diem la :" + studentList2);
    }

}
