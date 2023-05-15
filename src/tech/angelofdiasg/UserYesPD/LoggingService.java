package tech.angelofdiasg.UserYesPD;

import java.util.List;

public class LoggingService {
    private UserManagerSingleton userManager;

    public LoggingService() {
        userManager = UserManagerSingleton.getInstance();
    }

    public void logUserActivity(User user, String activity) {
        // Realiza o log da atividade do usu�rio
    	userManager.addUser(user);
    }

    public List<User> getUsers() {
        return userManager.getUsers();
    }
}
