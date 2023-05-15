package tech.angelofdiasg.UserYesPD;

import java.util.List;

public class UserService {
    private UserManagerSingleton userManager;

    public UserService() {
        userManager = UserManagerSingleton.getInstance();
    }

    public void registerUser(User user) {
        userManager.addUser(user);
    }

    public void removeUser(User user) {
        userManager.removeUser(user);
    }

    public List<User> getUsers() {
        return userManager.getUsers();
    }
}
