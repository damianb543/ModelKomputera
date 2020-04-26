public class Chlodzenie extends Komponent implements PobierzDane{

    private String typ;
    private String wentylator;

    public Chlodzenie(String producent, String model, float cena, String gwarancja, int ilosc, String typ, String wentylator) {
        super(producent, model, cena, gwarancja, ilosc);
        this.typ = typ;
        this.wentylator = wentylator;
    }

    public String getTyp() {
        return typ;
    }

    public String getWentylator() {
        return wentylator;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setWentylator(String wentylator) {
        this.wentylator = wentylator;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setTyp(dane[5]);
        this.setWentylator(dane[6]);

    }

    @Override
    public String daneDoPliku() {
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getTyp() + ";" + getWentylator();
    }
}
