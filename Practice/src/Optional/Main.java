package Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String [] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[4]);
        if (checkNull.isPresent()) {
            String lowerCase = str[4].toLowerCase();
            System.out.println();
        }else {
            System.out.println("not present");
        }

        Optional<User> user = Optional.empty();
        if (user.isPresent()) {
            System.out.println("is present");
        }
        else System.out.println("not present");


    }

}
