package tech.angelofdiasg.UserYesPD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManagerSingleton userManager = UserManagerSingleton.getInstance();

        User user1 = new User("john.doe", "password123");
        User user2 = new User("jane.doe", "password456");

        userManager.addUser(user1);
        userManager.addUser(user2);

        List<User> users = userManager.getUsers();
        for (User user : users) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println();
        }
    }
}
