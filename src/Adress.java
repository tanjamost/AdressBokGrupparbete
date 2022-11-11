public class Adress {
    private final String stad;
    private final String postkod;
    private final String gatunamn;
    private final String husnumm;

    public Adress(String stad, String postkod, String gatunamn, String husnumm) {
        this.stad = stad;
        this.postkod = postkod;
        this.gatunamn = gatunamn;
        this.husnumm = husnumm;
    }

    public String getGatunamn() {
        return gatunamn;
    }

    @Override
    public String toString() {
        return
                "stad='" + stad + '\'' +
                ", postkod='" + postkod + '\'' +
                ", gatunamn='" + gatunamn + '\'' +
                ", husnumm='" + husnumm + '\''
                ;
    }
}
