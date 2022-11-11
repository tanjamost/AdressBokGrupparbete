import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private final Map<String, Admin> admins = new HashMap<>();

    private User user = Guest.getInstance();

    public void register(String login, String password) {
        if (admins.containsKey(login)) {
            System.out.println("\nAnvändarnamn är upptaget\n");
        } else {
            admins.put(login, new Admin(login, password));
            System.out.println("\nAnvändare " + login + " är registrerad\n");
        }
    }

    public void login(String login, String password) {
        Admin admin = admins.get(login);

        if (password.equals(admin.getPassword())) {
            user = admin;
            System.out.println("\nDu är inloggad\n");
        } else {
            System.out.println("\nFel användarnamn eller lösenord\n");
        }
    }

    public void logout() {
        user = Guest.getInstance();
        System.out.println("\nDu är utloggad\n");
    }

    public User getUser() {
        return user;
    }
}
