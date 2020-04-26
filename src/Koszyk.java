public class Koszyk{

    private int iloscProduktow = 0;
    private int cenaProduktow = 0;

    public Koszyk()  {

    }

    public int getIloscProduktow() {
        return iloscProduktow;
    }

    public int getCenaProduktow() {
        return cenaProduktow;
    }

    public void dodajIlosc(int ilosc) {
        this.iloscProduktow += ilosc;
    }

    public void dodajCene(int cena) {
        this.cenaProduktow += cena;
    }

}
