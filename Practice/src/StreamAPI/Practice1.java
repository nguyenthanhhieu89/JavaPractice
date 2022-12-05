package StreamAPI;

import BlackHole.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice1 {
    public static void main(String[] args) {
//        Random random = new Random();
//        IntStream intStream = random.ints(0,100);
        // Cach 1
//        List<Object> numbers = new Random().ints(100, 0, 100).boxed().collect(Collectors.toList());
//        System.out.println(numbers);

        // Cach 2
        List<Integer> number2 = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            number2.add(new Random().nextInt(100));
//        }

        // Cach 3:
        IntStream.range(0, 1000).forEach(s -> {
            number2.add(new Random().nextInt(100));
        });
        System.out.println(number2);


        /// Stream bao gom 3 thanh phan
        // Stream Input - Phan khoi tao Stream
            // .stream()

        // Aggregate operation - Phan dieu kien

            //.filter(Condition) - Loc du lieu
            //.map(Map)  -  map du lieu
            //.limit(N) - So phan tu can lay ra
            //.sort(Condition)
            //.skip()  -  So phan tu can nhay qua

        // Stream output - Cai gia tri ma thang stream no se tra ra
            //.collect()  -  Du lieu se tong hop lai duoi dang Collection
            //.count()  -  dem so phan
    }

}
