package Practice4.Bai1.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();
        IntStream.range(0,1000).forEach(s -> {
            numbers.add(new Random().nextInt(1000));
        });

        System.out.println("1000 number random " +numbers);
       int s = (int) numbers.stream().filter(num -> num % 3 == 0).count();
        System.out.println("So phan tu chia het cho 3 la :" +s);
        int s1 = (int) numbers.stream().filter(num -> num % 5 == 0).count();
        System.out.println("So phan tu chia het cho 5 la :" +s1);
        System.out.println("Cac so chia het cho 4 la :" +numbers.stream().filter(num -> num % 4 == 0).collect(Collectors.toList()) );
        System.out.println("Cac so chia het cho 9 la :" +numbers.stream().filter(num -> num % 9 == 0).collect(Collectors.toList()) );
    }
}
