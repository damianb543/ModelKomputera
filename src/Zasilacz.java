public class Zasilacz extends Komponent implements PobierzDane{

    private int moc;
    private String standard;
    private String sprawnosc;
    private String certyfikat;

    public Zasilacz(String producent, String model, float cena, String gwarancja, int ilosc, int moc, String standard, String sprawnosc, String certyfikat) {
        super(producent, model, cena, gwarancja, ilosc);
        this.moc = moc;
        this.standard = standard;
        this.sprawnosc = sprawnosc;
        this.certyfikat = certyfikat;
    }

    public int getMoc() {
        return moc;
    }

    public String getCertyfikat() {
        return certyfikat;
    }

    public String getSprawnosc() {
        return sprawnosc;
    }

    public String getStandard() {
        return standard;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setSprawnosc(String sprawnosc) {
        this.sprawnosc = sprawnosc;
    }

    public void setCertyfikat(String certyfikat) {
        this.certyfikat = certyfikat;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setMoc(Integer.parseInt(dane[5]));
        this.setStandard(dane[6]);
        this.setSprawnosc(dane[7]);
        this.setCertyfikat(dane[8]);

    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;MOC;STANDARD;SPRAWNOSC;CERTYFIKAT
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getMoc() + ";" + getStandard() + ";" + getSprawnosc() + ";" + getCertyfikat();
    }
}
