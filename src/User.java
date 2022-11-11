import java.util.*;

public interface User {

    default void create(List<Kontakt> kontaktInfo, Map<Integer, Kontakt> idMap) {
        Scanner sc = new Scanner(System.in);
        String namn;
        String efternamn;
        String age;
        List<String> telnumm;

        String stad;
        String postkod;
        String gatunamn;
        String husnum;

        Adress adress;
        Kontakt kontakt;

        System.out.println("Ange namn");
        namn = sc.nextLine();
        System.out.println("Ange efternamn");
        efternamn = sc.nextLine();
        System.out.println("Ange ålder");
        age = sc.nextLine();
        System.out.println("Ange stad");
        stad = sc.nextLine();
        System.out.println("Ange postkod");
        postkod = sc.nextLine();
        System.out.println("Ange gatunamn");
        gatunamn = sc.nextLine();
        System.out.println("Ange portnummer");
        husnum = sc.nextLine();
        System.out.println("Ange telefonnummer, separera med kommatecken");
        telnumm = List.of(sc.nextLine().split(","));

        adress = new Adress(stad, postkod, gatunamn, husnum);
        kontakt = new Kontakt(namn, efternamn, age, adress, telnumm);
        kontaktInfo.add(kontakt);
        idMap.put(kontakt.getId(), kontakt);
        System.out.println("\nKontakt skapad\n");
        System.out.println(kontakt);

    }
    default void read(ArrayList<Kontakt> list, int type, String query) {
    if (type == 1) {
        for (Kontakt valueIter : list) {
            if (valueIter.getEfternamn().contains(query)) {
                System.out.println(valueIter);
                break;
            }
        }
    } else if (type == 2) {
        for (Kontakt valueIter : list) {
            if (valueIter.getAdress().getGatunamn().contains(query)) {
                System.out.println(valueIter);
            }
        }
    } else if (type == 3) {
        for (Kontakt valueIter : list) {
            if (valueIter.getNamn().contains(query)) {
                System.out.println(valueIter);
            }
        }
    } else if (type == 4) {
        for (Kontakt valueIter : list) {
            if (valueIter.getAdress().toString().contains(query) || valueIter.getEfternamn().contains(query) || (valueIter.getNamn().contains(query) || (valueIter.getAge().contains(query) || (valueIter.getTelnumm().toString().contains(query))))) {
                System.out.println(valueIter);
            }
        }
    }


    }



    void update(ArrayList<Kontakt> list, Map<Integer,Kontakt> idMap);

    void delete(ArrayList<Kontakt> list, Map<Integer,Kontakt> idMap);
}

