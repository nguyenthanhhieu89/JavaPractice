import java.util.*;

public class Main extends User{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            User user = new User();
            user.setUserId(i);
            System.out.println("Name user");
            user.setUserName(sc.nextLine());
            users.add(user);
        }
//        System.out.println(users.toString());
        users.sort(Comparator.comparing(User::getUserName));
        for (int i = 0; i < users.size() -10; i++) {
            System.out.println(users.get(i));
        }
    }
}
