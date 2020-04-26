public class Dysk extends Komponent implements PobierzDane{

    private int pojemnosc;
    private String interfejs;
    private String format;
    private int predkoscOdczytu;
    private String rodzaj;


    public Dysk(String producent, String model, float cena, String gwarancja, int ilosc, int pojemnosc, String interfejs, String format, int predkoscOdczytu, String rodzaj) {
        super(producent, model, cena, gwarancja, ilosc);
        this.pojemnosc = pojemnosc;
        this.interfejs = interfejs;
        this.format = format;
        this.predkoscOdczytu = predkoscOdczytu;
        this.rodzaj = rodzaj;

    }

    public String getInterfejs() {
        return interfejs;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public String getFormat() {
        return format;
    }

    public int getPredkoscOdczytu() {
        return predkoscOdczytu;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public void setPojemnosc(int pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setPredkoscOdczytu(int predkoscOdczytu) {
        this.predkoscOdczytu = predkoscOdczytu;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setPojemnosc(Integer.parseInt(dane[5]));
        this.setInterfejs(dane[6]);
        this.setFormat(dane[7]);
        this.setPredkoscOdczytu(Integer.parseInt(dane[8]));
        this.setRodzaj(dane[9]);

    }

    @Override
    public String daneDoPliku() {
    //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;POJEMNOSC;INTERFEJS;FORMAT;PREDKOSC ODCZYTU;RODZAJ
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getPojemnosc() + ";" + getInterfejs() + ";" + getFormat() + ";" + getPredkoscOdczytu() + ";" + getRodzaj();
    }

}
