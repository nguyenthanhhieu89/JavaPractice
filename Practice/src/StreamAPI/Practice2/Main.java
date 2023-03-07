package StreamAPI.Practice2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<StreamAPI.Practice2.User> users = new ArrayList<>();
        users.stream();
        IntStream.range(0,10).forEach(value -> {
            StreamAPI.Practice2.User user = new StreamAPI.Practice2.User();
            user.setUserId(value);
            user.setUsername(UUID.randomUUID().toString());
            user.setAddress(UUID.randomUUID().toString());
            users.add(user);
        });

        // Cau 2, su aggregate operation - .map
        List<String> usernameList = new ArrayList<>();
        // Cach for
        for (User user : users) {
            usernameList.add(user.getUsername());
        }

        // Cach stream - .map
        List<String> usernames = users.stream().map(User::getUsername).collect(Collectors.toList());
        List<User> users1 = users.stream().filter(user -> user.getUserId() % 2 == 0).collect(Collectors.toList());
    }
}
