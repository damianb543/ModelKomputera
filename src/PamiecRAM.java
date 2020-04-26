public class PamiecRAM extends Komponent implements PobierzDane{

    private String rodzajPamieci;
    private int pojemnoscKosci;
    private String iloscKosci;
    private int taktowanie;

    public PamiecRAM(String producent, String model, float cena, String gwarancja, int ilosc, String rodzajPamieci, int pojemnoscKosci, String iloscKosci, int taktowanie) {
        super(producent, model, cena, gwarancja, ilosc);
        this.rodzajPamieci = rodzajPamieci;
        this.pojemnoscKosci = pojemnoscKosci;
        this.iloscKosci = iloscKosci;
        this.taktowanie = taktowanie;
    }

    public String getIloscKosci() {
        return iloscKosci;
    }

    public int getPojemnoscKosci() {
        return pojemnoscKosci;
    }

    public int getTaktowanie() {
        return taktowanie;
    }

    public String getRodzajPamieci() {
        return rodzajPamieci;
    }

    public void setRodzajPamieci(String rodzajPamieci) {
        this.rodzajPamieci = rodzajPamieci;
    }

    public void setPojemnoscKosci(int pojemnoscKosci) {
        this.pojemnoscKosci = pojemnoscKosci;
    }

    public void setIloscKosci(String iloscKosci) {
        this.iloscKosci = iloscKosci;
    }

    public void setTaktowanie(int taktowanie) {
        this.taktowanie = taktowanie;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setRodzajPamieci(dane[5]);
        this.setPojemnoscKosci(Integer.parseInt(dane[6]));
        this.setIloscKosci(dane[7]);
        this.setTaktowanie(Integer.parseInt(dane[8]));
    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;RODZAJ PAMIECI;POJEMNOSC KOSCI;ILOSC KOSCI;TAKTOWANIE
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getRodzajPamieci() + ";" + getPojemnoscKosci() + ";" + getIloscKosci() + ";" + getTaktowanie();
    }
}
