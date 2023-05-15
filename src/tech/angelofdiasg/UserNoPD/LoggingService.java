package tech.angelofdiasg.UserNoPD;

import java.util.List;

public class LoggingService {
    private UserManager userManager;

    public LoggingService() {
        userManager = new UserManager();
    }

    public void logUserActivity(User user, String activity) {
        // Realiza o log da atividade do usuário
    	userManager.addUser(user);
    }

    public List<User> getUsers() {
        return userManager.getUsers();
    }
}