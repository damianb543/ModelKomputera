public class Komponent {

    private String producent;
    private String model;
    private float cena;
    private String gwarancja;
    private int ilosc;

    public Komponent(String producent, String model, float cena, String gwarancja, int ilosc) {
        this.producent = producent;
        this.model = model;
        this.cena = cena;
        this.gwarancja = gwarancja;
        this.ilosc = ilosc;
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public float getCena() {
        return cena;
    }

    public String getGwarancja() {
        return gwarancja;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public void setGwarancja(String gwarancja) {
        this.gwarancja = gwarancja;
    }
}
