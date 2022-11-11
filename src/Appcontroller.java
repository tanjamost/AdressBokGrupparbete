import java.util.Scanner;

public class Appcontroller {

    private static final Scanner scanner = new Scanner(System.in);
    private final AuthService authService = new AuthService();
    private Kontaktservice kontaktservice = new Kontaktservice();
    public static void main(String[] args) {



        Appcontroller appcontroller = new Appcontroller();
            while (true) {
                System.out.println("=========\nVälj: vill du registrera/logga in \n=========\n");
                System.out.println("registrera - tryck \"r\" \n");
                System.out.println("logga in - tryck \"l\" \n");
                System.out.println("logga ut - tryck \"u\" \n");
                System.out.println("=========\nEller gör följande val\n========= \n1 - skapa kontakt");
                System.out.println("2 - sök kontakt");
                System.out.println("3 - uppdatera kontakt - inloggning krävs\n (identifiera konto, du fill ändra, med id-nummer, för att få id, sök kontakten först)");
                System.out.println("4 - ta bort kontakt - inloggning krävs\n (identifiera konto, du fill ändra, med id-nummer, för att få id, sök kontakten först)");
                System.out.println("avsluta program - q");

                String input = scanner.nextLine();

                if (input.equals("q")) {
                    break;
                }
                if (input.equals("r")) {
                    appcontroller.register();
                } else if (input.equals("l")) {
                    appcontroller.login();
                } else if (input.equals("u")) {
                    appcontroller.logout();
                } else if (input.equals("1")) {
                    appcontroller.create();
                } else if (input.equals("2")) {
                    appcontroller.read();
                } else if (input.equals("3")) {
                    appcontroller.update();
                } else if (input.equals("4")) {
                    appcontroller.delete();
                }
            }
        }

    public void register() {
        String login;
        String password;

        System.out.println("ange användarnamn: ");
        login = scanner.nextLine();
        System.out.println("ange lösenord: ");
        password = scanner.nextLine();
        authService.register(login, password);
    }

    public void login() {
        String login;
        String password;

        System.out.println("ange användarnamn: ");
        login = scanner.nextLine();
        System.out.println("ange lösenord: ");
        password = scanner.nextLine();
        authService.login(login, password);
    }

    public void logout() {
        authService.logout();
    }

    public void create() {
        kontaktservice.createKontakt(authService.getUser());

    }

    public void read() {
        kontaktservice.readKontakt(authService.getUser());
    }

    public void update() {
        kontaktservice.updateKontakt(authService.getUser());
    }

    public void delete() {
        kontaktservice.deleteKontakt(authService.getUser());
    }
}