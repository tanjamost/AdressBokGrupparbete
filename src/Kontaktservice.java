import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kontaktservice {
    private final ArrayList<Kontakt> list = new ArrayList<>();

    private final Map<Integer, Kontakt> idMap = new HashMap<>();

    // methods
    public void createKontakt(User user) {
        user.create(list, idMap);

    }
    public void readKontakt(User user) {
        Scanner scanner = new Scanner(System.in);
        int type;
        String query;

        System.out.println("sök typ");
        System.out.println("1 - sök efternamn");
        System.out.println("2 - sök adress");
        System.out.println("3 - sök förnamn");
        System.out.println("4 - sök fritext");

        type = Integer.parseInt(scanner.nextLine());
        if (type == 1) {
            System.out.println("Ange efternamn");
                } else if (type == 2) {
            System.out.println("Ange adress (gatunamn)");
        } else if (type == 3) {
        System.out.println("Ange förnamn");
    }else if (type == 4) {
            System.out.println("Ange fritext");
        }

        query = scanner.nextLine();

        user.read(list, type, query);

    }
    public void updateKontakt(User user) {
        user.update(list, idMap);
    }
    public void deleteKontakt(User user) {
        user.delete(list, idMap);
    }
}
