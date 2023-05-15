package tech.angelofdiasg.UserNoPD;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        LoggingService loggingService = new LoggingService();

        User user1 = new User("john.doe", "password123");
        User user2 = new User("jane.doe", "password456");

        userService.registerUser(user1);
        userService.registerUser(user2);
        loggingService.logUserActivity(user1, "Login");
        loggingService.logUserActivity(user2, "Login");
        userService.removeUser(user1);

        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println();
        }

        users = loggingService.getUsers();
        for (User user : users) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println();
        }
    }
}
