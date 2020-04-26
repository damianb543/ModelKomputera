public class PlytaGlowna extends Komponent implements PobierzDane {

    private String obslugiwaneProcesory;
    private String format;
    private String gniazdoProcesora;
    private String chipset;

    public PlytaGlowna(String producent, String model, float cena, String gwarancja, int ilosc, String obslugiwaneProcesory, String format, String gniazdoProcesora, String chipset) {
        super(producent, model, cena, gwarancja, ilosc);
        this.obslugiwaneProcesory = obslugiwaneProcesory;
        this.format = format;
        this.gniazdoProcesora = gniazdoProcesora;
        this.chipset = chipset;
    }


    public String getChipset() {
        return chipset;
    }

    public String getGniazdoProcesora() {
        return gniazdoProcesora;
    }

    public String getFormat() {
        return format;
    }

    public String getObslugiwaneProcesory() {
        return obslugiwaneProcesory;
    }

    public void setObslugiwaneProcesory(String obslugiwaneProcesory) {
        this.obslugiwaneProcesory = obslugiwaneProcesory;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setGniazdoProcesora(String gniazdoProcesora) {
        this.gniazdoProcesora = gniazdoProcesora;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public void getDaneZPliku(String linia) {

        String[] dane = linia.split(";");

        this.setProducent(dane[0]);
        this.setModel(dane[1]);
        this.setCena(Float.parseFloat(dane[2]));
        this.setGwarancja(dane[3]);
        this.setIlosc(Integer.parseInt(dane[4]));

        this.setObslugiwaneProcesory(dane[5]);
        this.setFormat(dane[6]);
        this.setGniazdoProcesora(dane[7]);
        this.setChipset(dane[8]);


    }

    @Override
    public String daneDoPliku() {
        //PRODUCENT;MODEL;CENA;GWARANCJA;ILOSC;OBSLUGIWANE PROCESORY;FORMAT;GNIAZDO PROCESORA;CHIPSET
        return getProducent() + ";" + getModel() + ";" + getCena() + ";" + getGwarancja() + ";" + getIlosc() + ";" + getObslugiwaneProcesory() + ";" + getFormat() + ";" + getGniazdoProcesora() + ";" + getChipset();
    }

}
