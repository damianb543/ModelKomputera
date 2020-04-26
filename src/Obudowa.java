public class Obudowa extends Komponent implements PobierzDane{

    private float waga;
    private int wysokosc;
    private int szerokosc;
    private int glebokosc;
    private String standardPlyty;
    private String material;

    public Obudowa(String producent, String model, float cena, String gwarancja, int ilosc, float waga, int wysokosc, int szerokosc, int glebokosc, String standardPlyty, String material) {
        super(producent, model, cena, gwarancja, ilosc);
        this. waga = waga;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.glebokosc = glebokosc;
        this.standardPlyty = standardPlyty;
        this.material = material;
    }

    public String getStandardPlyty() {
        return standardPlyty;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getGlebokosc() {
        return glebokosc;
    }


    public float getWaga() {
        return waga;
    }


    public int getWysokosc() {
        return wysokosc;
    }

    public String getMaterial() {
        return material;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public void setGlebokosc(int glebokosc) {
        this.glebokosc = glebokosc;
    }

    public void setStandardPlyty(String standardPlyty) {
        this.standardPlyty = standardPlyty;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setWaga(Float.parseFloat(dane[5]));
        this.setWysokosc(Integer.parseInt(dane[6]));
        this.setSzerokosc(Integer.parseInt(dane[7]));
        this.setGlebokosc(Integer.parseInt(dane[8]));
        this.setStandardPlyty(dane[9]);
        this.setMaterial(dane[10]);
    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;WAGA;WYSOKOSC;SZEROKOSC;GLEBOKOSC;STANDARD PLYTY;MATERIAL
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getWaga() + ";" + getWysokosc() + ";" + getSzerokosc() + ";" + getGlebokosc() + ";" + getStandardPlyty() + ";" + getMaterial();
    }
}
