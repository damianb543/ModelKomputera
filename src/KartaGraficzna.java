public class KartaGraficzna extends Komponent implements PobierzDane {

    private int pamiec;
    private String rodzajPamieci;
    private String zlacza;

    public KartaGraficzna(String producent, String model, float cena, String gwarancja, int ilosc, int pamiec, String rodzajPamieci, String zlacza) {
        super(producent, model, cena, gwarancja, ilosc);
        this.pamiec = pamiec;
        this.rodzajPamieci = rodzajPamieci;
        this.zlacza = zlacza;
    }

    public int getPamiec() {
        return pamiec;
    }

    public String getRodzajPamieci() {
        return rodzajPamieci;
    }

    public String getZlacza() {
        return zlacza;
    }

    public void setPamiec(int pamiec) {
        this.pamiec = pamiec;
    }

    public void setRodzajPamieci(String rodzajPamieci) {
        this.rodzajPamieci = rodzajPamieci;
    }

    public void setZlacza(String zlacza) {
        this.zlacza = zlacza;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setPamiec(Integer.parseInt(dane[5]));
        this.setRodzajPamieci(dane[6]);
        this.setZlacza(dane[7]);
    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;PAMIEC;RODZAJ PAMIECI;ZLACZA
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getPamiec() + ";" + getRodzajPamieci() + ";" + getZlacza();
    }
}
