import java.util.List;

public class Kontakt {

    private String namn;
    private String efternamn;
    private String age;
    private static int counter = 0;
    private int id;
    private Adress adress;
    private List<String> telnumm;

    public Kontakt(String namn, String efternamn, String age, Adress adress, List<String> telnumm) {
        this.namn = namn;
        this.efternamn = efternamn;
        this.age = age;
        this.id = ++counter;
        this.adress = adress;
        this.telnumm = telnumm;
    }


    public int getId() {
        return id;
    }

    public String getNamn() {
        return namn;
    }

    public String getEfternamn() {
        return efternamn;
    }

    public String getAge() {
        return age;
    }

    public Adress getAdress() {
        return adress;
    }

    public List<String> getTelnumm() {
        return telnumm;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setEfternamn(String efternamn) {
        this.efternamn = efternamn;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setTelnumm(List<String> telnumm) {
        this.telnumm = telnumm;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "id=" + id +
                ", namn=" + namn +
                ", efternamn=" + efternamn +
                ", age=" + age +
                ", adress=" + adress +
                ", telnumm=" + telnumm +
                '}';
    }
}
