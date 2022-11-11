import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Admin implements User {

    private final String login;
    private final String password;

    public Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void update(ArrayList<Kontakt> list, Map<Integer, Kontakt> idMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange kontakt-id");
        int id = Integer.parseInt(scanner.nextLine());

        if (idMap.containsKey(id)) {
            Kontakt kontakt = idMap.get(id);

            System.out.println("Vad som ska ändras?");
            System.out.println("1 - Namn");
            System.out.println("2 - Efternamn");
            System.out.println("3 - Adress");
            System.out.println("4 - Åldern");
            System.out.println("5 - Telefonnumer");
            int type = Integer.parseInt(scanner.nextLine());
            if (type == 1) {

                System.out.println("Ange nytt namn");

                kontakt.setNamn(scanner.nextLine());

            } else if (type == 2) {
                System.out.println("Ange nytt efternamn");
                kontakt.setEfternamn(scanner.nextLine());

            } else if (type == 3) {
                System.out.println("Ange stad");
                String city = scanner.nextLine();
                System.out.println("Ange postkod");
                String postcode = scanner.nextLine();
                System.out.println("Ange gatunamn");
                String street = scanner.nextLine();
                System.out.println("Ange portnummer");
                String gate = scanner.nextLine();

                kontakt.setAdress(new Adress(city, postcode, street, gate));

            } else if (type == 4) {
                System.out.println("Ange åldern");
                kontakt.setAge(scanner.nextLine());
            } else if (type == 5) {
                System.out.println("Ange telefonnummer, separera med kommatecken");
                List<String> telefonnum = List.of(scanner.nextLine().split(","));
                kontakt.setTelnumm(telefonnum);
            }
        } else {
            System.out.println("Det finns ingen kontakt med angivet kontakt-id");
        }
    }

    @Override
    public void delete(ArrayList<Kontakt> list, Map<Integer, Kontakt> idMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange kontakts id");
        int id = Integer.parseInt(scanner.nextLine());

        if (idMap.containsKey(id)) {
            Kontakt kontakt = idMap.get(id);
            list.remove(kontakt);

            idMap.remove(id);
        }
    }
}
