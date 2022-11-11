import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Guest implements User {

    private static final Guest instance = new Guest();

    private Guest() {

    }

    public static Guest getInstance() {
        return instance;
    }

    @Override
    public void update(ArrayList<Kontakt> list, Map<Integer, Kontakt> idMap) {
        System.out.println("För att uppdatera kontakten måste du egistrera\n och/eller logga in\n");
    }

    @Override
    public void delete(ArrayList<Kontakt> list, Map<Integer, Kontakt> idMap) {
        System.out.println("För att ta bort kontakten måste du egistrera\n och/eller logga in\n");
    }
}
