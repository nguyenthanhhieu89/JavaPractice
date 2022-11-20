import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class UUid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        List<String> strings1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            strings.add(uuid.toString());
//            System.out.println(strings);
        }
        for (String a: strings) {
            if (a.contains("a")){
                strings1.add(a);
                System.out.println(strings1);
            }
        }
    }
}
