public class Procesor extends Komponent implements PobierzDane{

    private int liczbaRdzeni;
    private float taktowanieRdzenia;
    private int cache;

    public Procesor(String producent, String model, float cena, String gwarancja, int ilosc, int liczbaRdzeni, float taktowanieRdzenia, int cache) {
        super(producent, model, cena, gwarancja, ilosc);
        this.liczbaRdzeni = liczbaRdzeni;
        this.taktowanieRdzenia = taktowanieRdzenia;
        this.cache = cache;
    }

    public float getTaktowanieRdzenia() {
        return taktowanieRdzenia;
    }

    public int getCache() {
        return cache;
    }

    public int getLiczbaRdzeni() {
        return liczbaRdzeni;
    }

    public void setLiczbaRdzeni(int liczbaRdzeni) {
        this.liczbaRdzeni = liczbaRdzeni;
    }

    public void setTaktowanieRdzenia(float taktowanieRdzenia) {
        this.taktowanieRdzenia = taktowanieRdzenia;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setLiczbaRdzeni(Integer.parseInt(dane[5]));
        this.setTaktowanieRdzenia(Float.parseFloat(dane[6]));
        this.setCache(Integer.parseInt(dane[7]));



    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;LICZBA RDZENI;TAKTOWANIE RDZENIA;CACHE
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getLiczbaRdzeni() + ";" + getTaktowanieRdzenia() + ";" + getCache();
    }
}
