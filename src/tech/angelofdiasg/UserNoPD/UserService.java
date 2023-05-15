package tech.angelofdiasg.UserNoPD;

import java.util.List;

public class UserService {
    private UserManager userManager;

    public UserService() {
        userManager = new UserManager();
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
