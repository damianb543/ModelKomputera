public class Naped extends Komponent implements PobierzDane{

    private String rodzajNapedu;
    private String interfejs;
    private String zapis;
    private String odczyt;


    public Naped(String producent, String model, float cena, String gwarancja, int ilosc, String rodzajNapedu, String interfejs, String zapis, String odczyt) {
        super(producent, model, cena, gwarancja, ilosc);
        this.rodzajNapedu =rodzajNapedu;
        this.interfejs = interfejs;
        this.zapis = zapis;
        this.odczyt = odczyt;
    }

    public String getInterfejs() {
        return interfejs;
    }

    public String getOdczyt() {
        return odczyt;
    }

    public String getZapis() {
        return zapis;
    }

    public String getRodzajNapedu() {
        return rodzajNapedu;
    }

    public void setRodzajNapedu(String rodzajNapedu) {
        this.rodzajNapedu = rodzajNapedu;
    }

    public void setInterfejs(String interfejs) {
        this.interfejs = interfejs;
    }

    public void setZapis(String zapis) {
        this.zapis = zapis;
    }

    public void setOdczyt(String odczyt) {
        this.odczyt = odczyt;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setRodzajNapedu(dane[5]);
        this.setInterfejs(dane[6]);
        this.setZapis(dane[7]);
        this.setOdczyt(dane[8]);
    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;RODZAJ NAPEDU;INTERFEJS;ZAPIS;ODCZYT
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getRodzajNapedu() + ";" + getInterfejs() + ";" + getZapis() + ";" + getOdczyt();
    }
}
