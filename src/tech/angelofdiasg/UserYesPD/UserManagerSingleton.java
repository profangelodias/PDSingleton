package tech.angelofdiasg.UserYesPD;

import java.util.ArrayList;
import java.util.List;

public class UserManagerSingleton {
    private static UserManagerSingleton instance;
    private List<User> users;

    private UserManagerSingleton() {
        users = new ArrayList<>();
    }

    public static UserManagerSingleton getInstance() {
        if (instance == null) {
            instance = new UserManagerSingleton();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}

