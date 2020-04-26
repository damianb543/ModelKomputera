import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class StronaGlownaGUI {
    private JPanel panel1;
    private JTextField koszykAktualnaCena;
    private JTextField koszykIloscProduktow;
    private JButton dyskiTwardeHDDIButton;
    private JButton kartyGraficzneButton;
    private JButton procesoryButton;
    private JButton pamieciRAMButton;
    private JButton obudowyKomputeroweButton;
    private JButton plytyGlowneButton;
    private JButton zasilaczeKomputeroweButton;
    private JButton chlodzeniaKomputeroweButton;
    private JButton napedyOptyczneButton;
    private JButton zamowButton;
    private JTabbedPane zakladki;
    private JTextField dyskGwarancja;
    private JTextField dyskProducent;
    private JTextField dyskModel;
    private JTextField dyskPojemnosc;
    private JTextField dyskInterfejs;
    private JTextField dyskFormat;
    private JTextField dyskPredkoscOdczytu;
    private JTextField dyskRodzaj;
    private JTextField pamiecCena;
    private JTextField dyskCena;
    private JTextField kartaCena;
    private JTextField procesorCena;
    private JTextField plytaCena;
    private JTextField obudowaCena;
    private JTextField zasilaczCena;
    private JTextField chlodzenieCena;
    private JTextField napedCena;
    private JButton napedDodajDoKoszykaButton;
    private JButton napedPoprzedniProduktButton;
    private JButton napedNastepnyProduktButton;
    private JButton dyskPoprzedniProduktButton;
    private JButton dyskDodajDoKoszykaButton;
    private JButton dyskNastepnyProduktButton;
    private JButton procesorPoprzedniProduktButton;
    private JButton procesorDodajDoKoszykaButton;
    private JButton procesorNastepnyProduktButton;
    private JButton plytaPoprzedniProduktButton;
    private JButton plytaNastepnyProduktButton;
    private JButton plytaDodajDoKoszykaButton;
    private JButton pamiecPoprzedniProduktButton;
    private JButton pamiecNastepnyProduktButton;
    private JButton pamiecDodajDoKoszykaButton;
    private JButton obudowaPoprzedniProduktButton;
    private JButton obudowaNastepnyProduktButton;
    private JButton obudowaDodajDoKoszykaButton;
    private JButton zasilaczPoprzedniProduktButton;
    private JButton zasilaczNastepnyProduktButton;
    private JButton zasilaczDodajDoKoszykaButton;
    private JButton chlodzeniePoprzedniProduktButton;
    private JButton chlodzenieNastepnyProduktButton;
    private JButton chlodzenieDodajDoKoszykaButton;
    private JTextField kartaProducent;
    private JTextField kartaModel;
    private JTextField kartaPamiec;
    private JTextField kartaRodzajPamieci;
    private JTextField kartaZlacza;
    private JTextField kartaGwarancja;
    private JButton kartaPoprzedniProduktButton;
    private JButton kartaNastepnyProduktButton;
    private JButton kartaDodajDoKoszykaButton;
    private JTextField pamiecProducent;
    private JTextField pamiecModel;
    private JTextField pamiecRodzajPamieci;
    private JTextField pamiecPojemnosc;
    private JTextField pamiecIlosc;
    private JTextField pamiecTaktowanie;
    private JTextField pamiecGwarancja;
    private JTextField obudowaProducent;
    private JTextField obudowaModel;
    private JTextField obudowaWaga;
    private JTextField obudowaWymiary;
    private JTextField obudowaStandard;
    private JTextField obudowaMaterial;
    private JTextField obudowaGwarancja;
    private JTextField chlodzenieProducent;
    private JTextField chlodzenieModel;
    private JTextField chlodzenieTyp;
    private JTextField chlodzenieWentylator;
    private JTextField chlodzenieGwarancja;
    private JTextField napedModel;
    private JTextField napedRodzajNapedu;
    private JTextField napedInterfejs;
    private JTextField napedZapis;
    private JTextField napedOdczyt;
    private JTextField napedGwarancja;
    private JTextField plytaProducent;
    private JTextField plytaModel;
    private JTextField plytaObsProcesory;
    private JTextField plytaFormat;
    private JTextField plytaGniazdo;
    private JTextField plytaChipset;
    private JTextField plytaGwarancja;
    private JTextField procesorGwarancja;
    private JTextField procesorProducent;
    private JTextField procesorModel;
    private JTextField procesorLiczbaRdzeni;
    private JTextField procesorTaktowanie;
    private JTextField procesorCache;
    private JTextField zasilaczProducent;
    private JTextField zasilaczModel;
    private JTextField zasilaczMoc;
    private JTextField zasilaczStandard;
    private JTextField zasilaczSprawnosc;
    private JTextField zasilaczCertyfikat;
    private JTextField zasilaczGwarancja;
    private JButton stworzPCButton;
    private JScrollBar scrollBar1;
    private JTabbedPane komponenty;
    private JTextField napedProducent;
    private JTextField dyskDostepnaIlosc;
    private JSpinner dyskWybranaIloscSpinner;
    private JSpinner kartaWybranaIloscSpinner;
    private JTextField kartaDostepnaIlosc;
    private JSpinner procesorWybranaIloscSpinner;
    private JSpinner plytyWybranaIloscSpinner;
    private JTextField plytyDostepnaIlosc;
    private JTextField procesorDostepnaIlosc;
    private JTextField pamiecDostepnaIlosc;
    private JSpinner pamiecWybranaIloscSpinner;
    private JSpinner obudowyWybranaIloscSpinner;
    private JTextField obudowyDostepnaIlosc;
    private JSpinner zasilaczWybranaIloscSpinner;
    private JTextField zasilaczDostepnaIlosc;
    private JSpinner chlodzenieWybranaIloscSpinner;
    private JTextField chlodzenieDostepnaIlosc;
    private JSpinner napedWybranaIloscSpinner;
    private JTextField napedDostepnaIlosc;
    private JPanel Dyski;

    private LinkedList<Chlodzenie> chlodzenia;
    private LinkedList<Dysk> dyski;
    private LinkedList<KartaGraficzna> kartyGraficzne;
    private LinkedList<Naped> napedy;
    private LinkedList<Obudowa> obudowy;
    private LinkedList<PamiecRAM> pamieciRAM;
    private LinkedList<PlytaGlowna> plytyGlowne;
    private LinkedList<Procesor> procesory;
    private LinkedList<Zasilacz> zasilacze;


    private int chlodzenieIndeks = 0;
    private int dyskIndeks = 0;
    private int kartaGraficznaIndeks = 0;
    private int napedIndeks = 0;
    private int obudowaIndeks = 0;
    private int pamiecRAMIndeks = 0;
    private int plytaGlownaIndeks = 0;
    private int procesorIndeks = 0;
    private int zasilaczIndeks = 0;

    private boolean trybStworzPC;

    private boolean[] wymaganeKomponenty = new boolean[7];

    private Koszyk koszyk = new Koszyk();
    private StworzPCGUI stworzPCGUI = new StworzPCGUI();


    public StronaGlownaGUI() {

        listener();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    getDane();
                    Thread.sleep(1000);
                    refresh();
                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        ustawieniaPoczatkoweKomponentow();
        ustawieniaPoczatkowePrzyciskow();
    }


    void refresh() {
        dyskRefresh();
        chlodzenieRefresh();
        kartaGraficznaRefresh();
        napedRefresh();
        obudowaRefresh();
        pamiecRAMRefresh();
        zasilaczRefresh();
        plytaGlownaRefresh();
        procesorRefresh();

    }


    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("StronaGlowna");
        frame.setContentPane(new StronaGlownaGUI().panel1);
        frame.setContentPane(new StronaGlownaGUI().zakladki);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public void listener() {

        stworzPCButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(0);
            zakladki.setEnabled(false);
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame, "Witamy w kreatorze PC!");
            komponenty.setForeground(Color.red);
            komponenty.setForegroundAt(7, Color.blue);
            komponenty.setForegroundAt(8, Color.blue);
            trybStworzPC = true;
            stworzPCGUI.wyswietlPCGUI();
        });

        zamowButton.addActionListener(e -> {
            if (koszyk.getIloscProduktow() > 0) {
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Zostałeś nabrany, to nie jest prawdziwy sklep :)");
            } else {
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Nie dodałeś nic do koszyka!");
            }
        });

// Menu
        dyskiTwardeHDDIButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(0);
            dyskRefresh();
        });

        kartyGraficzneButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(1);
            kartaGraficznaRefresh();
        });

        procesoryButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(2);
            procesorRefresh();
        });

        plytyGlowneButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(3);
            plytaGlownaRefresh();
        });

        pamieciRAMButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(4);
            pamiecRAMRefresh();
        });

        obudowyKomputeroweButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(5);
            obudowaRefresh();
        });

        zasilaczeKomputeroweButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(6);
            zasilaczRefresh();
        });

        chlodzeniaKomputeroweButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(7);
            chlodzenieRefresh();
        });

        napedyOptyczneButton.addActionListener(e -> {
            zakladki.setSelectedIndex(1);
            komponenty.setSelectedIndex(8);
            napedRefresh();
        });

// Dodaj do koszyka

        chlodzenieDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) chlodzenieWybranaIloscSpinner.getValue();
            int cena = (int) chlodzenia.get(chlodzenieIndeks).getCena();
            if (ilosc > 0) {
                chlodzenia.get(chlodzenieIndeks).setIlosc(chlodzenia.get(chlodzenieIndeks).getIlosc() - ilosc);
                chlodzenieWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                chlodzenieRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(7, Color.green);
                }
                try {
                    daneDoPlikuChlodzenie();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(chlodzenia.get(chlodzenieIndeks).getIlosc());
            }
        });

        dyskDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) dyskWybranaIloscSpinner.getValue();
            int cena = (int) dyski.get(dyskIndeks).getCena();
            if (ilosc > 0) {
                dyski.get(dyskIndeks).setIlosc(dyski.get(dyskIndeks).getIlosc() - ilosc);
                dyskWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                dyskRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(0, Color.green);
                    wymaganeKomponenty[0] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuDysk();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(dyski.get(dyskIndeks).getIlosc());
            }
        });

        kartaDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) kartaWybranaIloscSpinner.getValue();
            int cena = (int) kartyGraficzne.get(kartaGraficznaIndeks).getCena();
            if (ilosc > 0) {
                kartyGraficzne.get(kartaGraficznaIndeks).setIlosc(kartyGraficzne.get(kartaGraficznaIndeks).getIlosc() - ilosc);
                kartaWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                kartaGraficznaRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(1, Color.green);
                    wymaganeKomponenty[1] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuKartaGraficzna();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(kartyGraficzne.get(kartaGraficznaIndeks).getIlosc());
            }
        });

        napedDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) napedWybranaIloscSpinner.getValue();
            int cena = (int) napedy.get(napedIndeks).getCena();
            if (ilosc > 0) {
                napedy.get(napedIndeks).setIlosc(napedy.get(napedIndeks).getIlosc() - ilosc);
                napedWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                napedRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(8, Color.green);
                }
                try {
                    daneDoPlikuNaped();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(napedy.get(napedIndeks).getIlosc());
            }
        });

        obudowaDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) obudowyWybranaIloscSpinner.getValue();
            int cena = (int) obudowy.get(obudowaIndeks).getCena();
            if (ilosc > 0) {
                obudowy.get(obudowaIndeks).setIlosc(obudowy.get(obudowaIndeks).getIlosc() - ilosc);
                obudowyWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                obudowaRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(5, Color.green);
                    wymaganeKomponenty[5] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuObudowa();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(obudowy.get(obudowaIndeks).getIlosc());
            }
        });

        pamiecDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) pamiecWybranaIloscSpinner.getValue();
            int cena = (int) pamieciRAM.get(pamiecRAMIndeks).getCena();
            if (ilosc > 0) {
                pamieciRAM.get(pamiecRAMIndeks).setIlosc(pamieciRAM.get(pamiecRAMIndeks).getIlosc() - ilosc);
                pamiecWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                pamiecRAMRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(4, Color.green);
                    wymaganeKomponenty[4] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuPamiecRAM();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(pamieciRAM.get(pamiecRAMIndeks).getIlosc());
            }
        });

        plytaDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) plytyWybranaIloscSpinner.getValue();
            int cena = (int) plytyGlowne.get(plytaGlownaIndeks).getCena();
            if (ilosc > 0) {
                plytyGlowne.get(plytaGlownaIndeks).setIlosc(plytyGlowne.get(plytaGlownaIndeks).getIlosc() - ilosc);
                plytyWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                plytaGlownaRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(3, Color.green);
                    wymaganeKomponenty[3] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuPlytaGlowna();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(plytyGlowne.get(plytaGlownaIndeks).getIlosc());
            }
        });

        procesorDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) procesorWybranaIloscSpinner.getValue();
            int cena = (int) procesory.get(procesorIndeks).getCena();
            if (ilosc > 0) {
                procesory.get(procesorIndeks).setIlosc(procesory.get(procesorIndeks).getIlosc() - ilosc);
                procesorWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                procesorRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(2, Color.green);
                    wymaganeKomponenty[2] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuProcesor();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(procesory.get(procesorIndeks).getIlosc());
            }
        });

        zasilaczDodajDoKoszykaButton.addActionListener(e -> {
            int ilosc = (int) zasilaczWybranaIloscSpinner.getValue();
            int cena = (int) zasilacze.get(zasilaczIndeks).getCena();
            if (ilosc > 0) {
                zasilacze.get(zasilaczIndeks).setIlosc(zasilacze.get(zasilaczIndeks).getIlosc() - ilosc);
                zasilaczWybranaIloscSpinner.setValue(0);
                JFrame frame = new JFrame("");
                JOptionPane.showMessageDialog(frame, "Dodano do koszyka");
                koszykRefresh(ilosc, cena);
                zasilaczRefresh();
                if (trybStworzPC) {
                    komponenty.setForegroundAt(6, Color.green);
                    wymaganeKomponenty[6] = true;
                    wszystkieKomunikat();
                }
                try {
                    daneDoPlikuZasilacz();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            } else {
                koszykInformacje(zasilacze.get(zasilaczIndeks).getIlosc());
            }
        });


//Nastepny poprzedni

        dyskNastepnyProduktButton.addActionListener(e -> {
            dyskIndeks++;
            if (dyskIndeks == dyski.size() - 1) {
                dyskNastepnyProduktButton.setEnabled(false);
                dyskPoprzedniProduktButton.setEnabled(true);
                dyskRefresh();
            } else {
                dyskPoprzedniProduktButton.setEnabled(true);
                dyskRefresh();
            }
        });

        dyskPoprzedniProduktButton.addActionListener(e -> {
            dyskIndeks--;
            if (dyskIndeks == 0) {
                dyskPoprzedniProduktButton.setEnabled(false);
                dyskNastepnyProduktButton.setEnabled(true);
                dyskRefresh();
            } else {
                dyskNastepnyProduktButton.setEnabled(true);
                dyskRefresh();
            }

        });

        chlodzenieNastepnyProduktButton.addActionListener(e -> {
            chlodzenieIndeks++;
            if (chlodzenieIndeks == chlodzenia.size() - 1) {
                chlodzenieNastepnyProduktButton.setEnabled(false);
                chlodzeniePoprzedniProduktButton.setEnabled(true);
                chlodzenieRefresh();
            } else {
                chlodzeniePoprzedniProduktButton.setEnabled(true);
                chlodzenieRefresh();
            }
        });

        chlodzeniePoprzedniProduktButton.addActionListener(e -> {
            chlodzenieIndeks--;
            if (chlodzenieIndeks == 0) {
                chlodzeniePoprzedniProduktButton.setEnabled(false);
                chlodzenieNastepnyProduktButton.setEnabled(true);
                chlodzenieRefresh();
            } else {
                chlodzenieNastepnyProduktButton.setEnabled(true);
                chlodzenieRefresh();
            }
        });

        kartaNastepnyProduktButton.addActionListener(e -> {
            kartaGraficznaIndeks++;
            if (kartaGraficznaIndeks == kartyGraficzne.size() - 1) {
                kartaNastepnyProduktButton.setEnabled(false);
                kartaPoprzedniProduktButton.setEnabled(true);
                kartaGraficznaRefresh();
            } else {
                kartaPoprzedniProduktButton.setEnabled(true);
                kartaGraficznaRefresh();
            }
        });

        kartaPoprzedniProduktButton.addActionListener(e -> {
            kartaGraficznaIndeks--;
            if (kartaGraficznaIndeks == 0) {
                kartaPoprzedniProduktButton.setEnabled(false);
                kartaNastepnyProduktButton.setEnabled(true);
                kartaGraficznaRefresh();
            } else {
                kartaNastepnyProduktButton.setEnabled(true);
                kartaGraficznaRefresh();
            }
        });

        napedNastepnyProduktButton.addActionListener(e -> {
            napedIndeks++;
            if (napedIndeks == napedy.size() - 1) {
                napedNastepnyProduktButton.setEnabled(false);
                napedPoprzedniProduktButton.setEnabled(true);
                napedRefresh();
            } else {
                napedPoprzedniProduktButton.setEnabled(true);
                napedRefresh();
            }

        });

        napedPoprzedniProduktButton.addActionListener(e -> {
            napedIndeks--;
            if (napedIndeks == 0) {
                napedPoprzedniProduktButton.setEnabled(false);
                napedNastepnyProduktButton.setEnabled(true);
                napedRefresh();
            } else {
                napedNastepnyProduktButton.setEnabled(true);
                napedRefresh();
            }
        });

        obudowaNastepnyProduktButton.addActionListener(e -> {
            obudowaIndeks++;
            if (obudowaIndeks == obudowy.size() - 1) {
                obudowaNastepnyProduktButton.setEnabled(false);
                obudowaPoprzedniProduktButton.setEnabled(true);
                obudowaRefresh();
            } else {
                obudowaPoprzedniProduktButton.setEnabled(true);
                obudowaRefresh();
            }
        });

        obudowaPoprzedniProduktButton.addActionListener(e -> {
            obudowaIndeks--;
            if (obudowaIndeks == 0) {
                obudowaPoprzedniProduktButton.setEnabled(false);
                obudowaNastepnyProduktButton.setEnabled(true);
                obudowaRefresh();
            } else {
                obudowaNastepnyProduktButton.setEnabled(true);
                obudowaRefresh();
            }
        });

        pamiecNastepnyProduktButton.addActionListener(e -> {
            pamiecRAMIndeks++;
            if (pamiecRAMIndeks == pamieciRAM.size() - 1) {
                pamiecNastepnyProduktButton.setEnabled(false);
                pamiecPoprzedniProduktButton.setEnabled(true);
                pamiecRAMRefresh();
            } else {
                pamiecPoprzedniProduktButton.setEnabled(true);
                pamiecRAMRefresh();
            }
        });

        pamiecPoprzedniProduktButton.addActionListener(e -> {
            pamiecRAMIndeks--;
            if (pamiecRAMIndeks == 0) {
                pamiecPoprzedniProduktButton.setEnabled(false);
                pamiecNastepnyProduktButton.setEnabled(true);
                pamiecRAMRefresh();
            } else {
                pamiecNastepnyProduktButton.setEnabled(true);
                pamiecRAMRefresh();
            }
        });

        plytaNastepnyProduktButton.addActionListener(e -> {
            plytaGlownaIndeks++;
            if (plytaGlownaIndeks == plytyGlowne.size() - 1) {
                plytaNastepnyProduktButton.setEnabled(false);
                plytaPoprzedniProduktButton.setEnabled(true);
                plytaGlownaRefresh();
            } else {
                plytaPoprzedniProduktButton.setEnabled(true);
                plytaGlownaRefresh();
            }
        });

        plytaPoprzedniProduktButton.addActionListener(e -> {
            plytaGlownaIndeks--;
            if (plytaGlownaIndeks == 0) {
                plytaPoprzedniProduktButton.setEnabled(false);
                plytaNastepnyProduktButton.setEnabled(true);
                plytaGlownaRefresh();
            } else {
                plytaNastepnyProduktButton.setEnabled(true);
                plytaGlownaRefresh();
            }
        });

        procesorNastepnyProduktButton.addActionListener(e -> {
            procesorIndeks++;
            if (procesorIndeks == procesory.size() - 1) {
                procesorNastepnyProduktButton.setEnabled(false);
                procesorPoprzedniProduktButton.setEnabled(true);
                procesorRefresh();
            } else {
                procesorPoprzedniProduktButton.setEnabled(true);
                procesorRefresh();
            }
        });

        procesorPoprzedniProduktButton.addActionListener(e -> {
            procesorIndeks--;
            if (procesorIndeks == 0) {
                procesorPoprzedniProduktButton.setEnabled(false);
                procesorNastepnyProduktButton.setEnabled(true);
                procesorRefresh();
            } else {
                procesorNastepnyProduktButton.setEnabled(true);
                procesorRefresh();
            }
        });

        zasilaczNastepnyProduktButton.addActionListener(e -> {
            zasilaczIndeks++;
            if (zasilaczIndeks == zasilacze.size() - 1) {
                zasilaczNastepnyProduktButton.setEnabled(false);
                zasilaczPoprzedniProduktButton.setEnabled(true);
                zasilaczRefresh();
            } else {
                zasilaczPoprzedniProduktButton.setEnabled(true);
                zasilaczRefresh();
            }
        });

        zasilaczPoprzedniProduktButton.addActionListener(e -> {
            zasilaczIndeks--;
            if (zasilaczIndeks == 0) {
                zasilaczPoprzedniProduktButton.setEnabled(false);
                zasilaczNastepnyProduktButton.setEnabled(true);
                zasilaczRefresh();
            } else {
                zasilaczNastepnyProduktButton.setEnabled(true);
                zasilaczRefresh();
            }
        });


    }


    public boolean sprawdzWymagane() {
        boolean wszystkie = true;
        for (Boolean b : wymaganeKomponenty) {
            if (!b) {
                wszystkie = false;
                break;
            }
        }
        return wszystkie;
    }

    private void wszystkieKomunikat() {
        if (sprawdzWymagane()) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame, "Wybrano wszystkie wymagane komponenty. Możesz przejść do koszyka");
            zakladki.setEnabled(true);
        }
    }

    private void koszykInformacje(int ilosc) {
        if (ilosc == 0) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame, "Brak wybranego produktu");
        } else {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame, "Proszę wybrać ilość");
        }
    }

    private void koszykRefresh(int ilosc, int cena) {
        koszyk.dodajIlosc(ilosc);
        koszyk.dodajCene(ilosc * cena);
        koszykIloscProduktow.setText(koszyk.getIloscProduktow() + "");
        koszykAktualnaCena.setText(koszyk.getCenaProduktow() + " zł");
    }


    private void ustawieniaPoczatkowePrzyciskow() {
        dyskPoprzedniProduktButton.setEnabled(false);
        kartaPoprzedniProduktButton.setEnabled(false);
        procesorPoprzedniProduktButton.setEnabled(false);
        plytaPoprzedniProduktButton.setEnabled(false);
        pamiecPoprzedniProduktButton.setEnabled(false);
        obudowaPoprzedniProduktButton.setEnabled(false);
        zasilaczPoprzedniProduktButton.setEnabled(false);
        chlodzeniePoprzedniProduktButton.setEnabled(false);
        napedPoprzedniProduktButton.setEnabled(false);
    }


    private void ustawieniaPoczatkoweOpisowDyskow() {
        dyskProducent.setEnabled(false);
        dyskModel.setEnabled(false);
        dyskCena.setEnabled(false);
        dyskGwarancja.setEnabled(false);
        dyskPojemnosc.setEnabled(false);
        dyskInterfejs.setEnabled(false);
        dyskFormat.setEnabled(false);
        dyskPredkoscOdczytu.setEnabled(false);
        dyskRodzaj.setEnabled(false);
        dyskDostepnaIlosc.setEnabled(false);

        dyskProducent.setDisabledTextColor(Color.black);
        dyskModel.setDisabledTextColor(Color.black);
        dyskCena.setDisabledTextColor(Color.black);
        dyskGwarancja.setDisabledTextColor(Color.black);
        dyskPojemnosc.setDisabledTextColor(Color.black);
        dyskInterfejs.setDisabledTextColor(Color.black);
        dyskFormat.setDisabledTextColor(Color.black);
        dyskPredkoscOdczytu.setDisabledTextColor(Color.black);
        dyskRodzaj.setDisabledTextColor(Color.black);
        dyskDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweOpisowProcesorow() {
        procesorProducent.setEnabled(false);
        procesorModel.setEnabled(false);
        procesorCena.setEnabled(false);
        procesorGwarancja.setEnabled(false);
        procesorLiczbaRdzeni.setEnabled(false);
        procesorTaktowanie.setEnabled(false);
        procesorCache.setEnabled(false);
        procesorDostepnaIlosc.setEnabled(false);

        procesorProducent.setDisabledTextColor(Color.black);
        procesorModel.setDisabledTextColor(Color.black);
        procesorCena.setDisabledTextColor(Color.black);
        procesorGwarancja.setDisabledTextColor(Color.black);
        procesorLiczbaRdzeni.setDisabledTextColor(Color.black);
        procesorTaktowanie.setDisabledTextColor(Color.black);
        procesorCache.setDisabledTextColor(Color.black);
        procesorDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweOpisowZasilaczy() {
        zasilaczProducent.setEnabled(false);
        zasilaczModel.setEnabled(false);
        zasilaczCena.setEnabled(false);
        zasilaczGwarancja.setEnabled(false);
        zasilaczMoc.setEnabled(false);
        zasilaczStandard.setEnabled(false);
        zasilaczSprawnosc.setEnabled(false);
        zasilaczCertyfikat.setEnabled(false);
        zasilaczDostepnaIlosc.setEnabled(false);

        zasilaczProducent.setDisabledTextColor(Color.black);
        zasilaczModel.setDisabledTextColor(Color.black);
        zasilaczCena.setDisabledTextColor(Color.black);
        zasilaczGwarancja.setDisabledTextColor(Color.black);
        zasilaczMoc.setDisabledTextColor(Color.black);
        zasilaczStandard.setDisabledTextColor(Color.black);
        zasilaczSprawnosc.setDisabledTextColor(Color.black);
        zasilaczCertyfikat.setDisabledTextColor(Color.black);
        zasilaczDostepnaIlosc.setDisabledTextColor(Color.black);

    }

    private void ustawieniaPoczatkoweOpisowNapedow() {
        napedProducent.setEnabled(false);
        napedModel.setEnabled(false);
        napedCena.setEnabled(false);
        napedGwarancja.setEnabled(false);
        napedRodzajNapedu.setEnabled(false);
        napedInterfejs.setEnabled(false);
        napedZapis.setEnabled(false);
        napedOdczyt.setEnabled(false);
        napedDostepnaIlosc.setEnabled(false);

        napedProducent.setDisabledTextColor(Color.black);
        napedModel.setDisabledTextColor(Color.black);
        napedCena.setDisabledTextColor(Color.black);
        napedGwarancja.setDisabledTextColor(Color.black);
        napedRodzajNapedu.setDisabledTextColor(Color.black);
        napedInterfejs.setDisabledTextColor(Color.black);
        napedZapis.setDisabledTextColor(Color.black);
        napedOdczyt.setDisabledTextColor(Color.black);
        napedDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweOpisowObudow() {
        obudowaProducent.setEnabled(false);
        obudowaModel.setEnabled(false);
        obudowaCena.setEnabled(false);
        obudowaGwarancja.setEnabled(false);
        obudowaWaga.setEnabled(false);
        obudowaStandard.setEnabled(false);
        obudowaMaterial.setEnabled(false);
        obudowaWymiary.setEnabled(false);
        obudowyDostepnaIlosc.setEnabled(false);

        obudowaProducent.setDisabledTextColor(Color.black);
        obudowaModel.setDisabledTextColor(Color.black);
        obudowaCena.setDisabledTextColor(Color.black);
        obudowaGwarancja.setDisabledTextColor(Color.black);
        obudowaWaga.setDisabledTextColor(Color.black);
        obudowaStandard.setDisabledTextColor(Color.black);
        obudowaMaterial.setDisabledTextColor(Color.black);
        obudowaWymiary.setDisabledTextColor(Color.black);
        obudowyDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweOpisowKart() {
        kartaProducent.setEnabled(false);
        kartaModel.setEnabled(false);
        kartaCena.setEnabled(false);
        kartaGwarancja.setEnabled(false);
        kartaPamiec.setEnabled(false);
        kartaRodzajPamieci.setEnabled(false);
        kartaZlacza.setEnabled(false);
        kartaDostepnaIlosc.setEnabled(false);

        kartaProducent.setDisabledTextColor(Color.black);
        kartaModel.setDisabledTextColor(Color.black);
        kartaCena.setDisabledTextColor(Color.black);
        kartaGwarancja.setDisabledTextColor(Color.black);
        kartaPamiec.setDisabledTextColor(Color.black);
        kartaRodzajPamieci.setDisabledTextColor(Color.black);
        kartaZlacza.setDisabledTextColor(Color.black);
        kartaDostepnaIlosc.setDisabledTextColor(Color.black);

    }

    private void ustawieniaPoczatkoweOpisowChlodzen() {
        chlodzenieProducent.setEnabled(false);
        chlodzenieModel.setEnabled(false);
        chlodzenieCena.setEnabled(false);
        chlodzenieGwarancja.setEnabled(false);
        chlodzenieTyp.setEnabled(false);
        chlodzenieWentylator.setEnabled(false);
        chlodzenieDostepnaIlosc.setEnabled(false);

        chlodzenieProducent.setDisabledTextColor(Color.black);
        chlodzenieModel.setDisabledTextColor(Color.black);
        chlodzenieCena.setDisabledTextColor(Color.black);
        chlodzenieGwarancja.setDisabledTextColor(Color.black);
        chlodzenieTyp.setDisabledTextColor(Color.black);
        chlodzenieWentylator.setDisabledTextColor(Color.black);
        chlodzenieDostepnaIlosc.setDisabledTextColor(Color.black);

    }

    private void ustawieniaPoczatkoweOpisowPlyt() {
        plytaProducent.setEnabled(false);
        plytaModel.setEnabled(false);
        plytaCena.setEnabled(false);
        plytaGwarancja.setEnabled(false);
        plytaObsProcesory.setEnabled(false);
        plytaFormat.setEnabled(false);
        plytaFormat.setEnabled(false);
        plytaGniazdo.setEnabled(false);
        plytaChipset.setEnabled(false);
        plytyDostepnaIlosc.setEnabled(false);

        plytaProducent.setDisabledTextColor(Color.black);
        plytaModel.setDisabledTextColor(Color.black);
        plytaCena.setDisabledTextColor(Color.black);
        plytaGwarancja.setDisabledTextColor(Color.black);
        plytaObsProcesory.setDisabledTextColor(Color.black);
        plytaFormat.setDisabledTextColor(Color.black);
        plytaFormat.setDisabledTextColor(Color.black);
        plytaGniazdo.setDisabledTextColor(Color.black);
        plytaChipset.setDisabledTextColor(Color.black);
        plytyDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweOpisowPamieci() {
        pamiecProducent.setEnabled(false);
        pamiecModel.setEnabled(false);
        pamiecCena.setEnabled(false);
        pamiecGwarancja.setEnabled(false);
        pamiecRodzajPamieci.setEnabled(false);
        pamiecPojemnosc.setEnabled(false);
        pamiecIlosc.setEnabled(false);
        pamiecTaktowanie.setEnabled(false);
        plytyDostepnaIlosc.setEnabled(false);

        pamiecProducent.setDisabledTextColor(Color.black);
        pamiecModel.setDisabledTextColor(Color.black);
        pamiecCena.setDisabledTextColor(Color.black);
        pamiecGwarancja.setDisabledTextColor(Color.black);
        pamiecRodzajPamieci.setDisabledTextColor(Color.black);
        pamiecPojemnosc.setDisabledTextColor(Color.black);
        pamiecIlosc.setDisabledTextColor(Color.black);
        pamiecTaktowanie.setDisabledTextColor(Color.black);
        plytyDostepnaIlosc.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweKoszyka() {
        koszykIloscProduktow.setEnabled(false);
        koszykAktualnaCena.setEnabled(false);
        koszykIloscProduktow.setText(0 + "");
        koszykAktualnaCena.setText(0 + " zł");

        koszykIloscProduktow.setDisabledTextColor(Color.black);
        koszykAktualnaCena.setDisabledTextColor(Color.black);
    }

    private void ustawieniaPoczatkoweKomponentow() {
        ustawieniaPoczatkoweOpisowZasilaczy();
        ustawieniaPoczatkoweOpisowProcesorow();
        ustawieniaPoczatkoweOpisowObudow();
        ustawieniaPoczatkoweOpisowNapedow();
        ustawieniaPoczatkoweOpisowKart();
        ustawieniaPoczatkoweOpisowChlodzen();
        ustawieniaPoczatkoweOpisowDyskow();
        ustawieniaPoczatkoweOpisowPamieci();
        ustawieniaPoczatkoweOpisowPlyt();
        ustawieniaPoczatkoweKoszyka();
    }


    private void dyskRefresh() {
        dyskProducent.setText(dyski.get(dyskIndeks).getProducent());
        dyskModel.setText(dyski.get(dyskIndeks).getModel());
        dyskCena.setText(dyski.get(dyskIndeks).getCena() + " zl ");
        dyskGwarancja.setText(dyski.get(dyskIndeks).getGwarancja());
        dyskPojemnosc.setText(dyski.get(dyskIndeks).getPojemnosc() + " GB ");
        dyskInterfejs.setText(dyski.get(dyskIndeks).getInterfejs());
        dyskFormat.setText(dyski.get(dyskIndeks).getFormat());
        dyskPredkoscOdczytu.setText(dyski.get(dyskIndeks).getPredkoscOdczytu() + " MB/s ");
        dyskRodzaj.setText(dyski.get(dyskIndeks).getRodzaj());

        dyskWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, dyski.get(dyskIndeks).getIlosc(), 1));
        dyskDostepnaIlosc.setText(dyski.get(dyskIndeks).getIlosc() + "");
        dyskDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        dyskCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void chlodzenieRefresh() {
        chlodzenieProducent.setText(chlodzenia.get(chlodzenieIndeks).getProducent());
        chlodzenieModel.setText(chlodzenia.get(chlodzenieIndeks).getModel());
        chlodzenieCena.setText(chlodzenia.get(chlodzenieIndeks).getCena() + " zl ");
        chlodzenieGwarancja.setText(chlodzenia.get(chlodzenieIndeks).getGwarancja());
        chlodzenieTyp.setText(chlodzenia.get(chlodzenieIndeks).getTyp());
        chlodzenieWentylator.setText(chlodzenia.get(chlodzenieIndeks).getWentylator());

        chlodzenieWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, chlodzenia.get(chlodzenieIndeks).getIlosc(), 1));
        chlodzenieDostepnaIlosc.setText(chlodzenia.get(chlodzenieIndeks).getIlosc() + "");
        chlodzenieDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        chlodzenieCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void kartaGraficznaRefresh() {
        kartaProducent.setText(kartyGraficzne.get(kartaGraficznaIndeks).getProducent());
        kartaModel.setText(kartyGraficzne.get(kartaGraficznaIndeks).getModel());
        kartaCena.setText(kartyGraficzne.get(kartaGraficznaIndeks).getCena() + " zl ");
        kartaGwarancja.setText(kartyGraficzne.get(kartaGraficznaIndeks).getGwarancja());
        kartaPamiec.setText(kartyGraficzne.get(kartaGraficznaIndeks).getPamiec() + " GB ");
        kartaRodzajPamieci.setText(kartyGraficzne.get(kartaGraficznaIndeks).getRodzajPamieci() + "");
        kartaZlacza.setText(kartyGraficzne.get(kartaGraficznaIndeks).getZlacza() + "");

        kartaWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, kartyGraficzne.get(kartaGraficznaIndeks).getIlosc(), 1));
        kartaDostepnaIlosc.setText(kartyGraficzne.get(kartaGraficznaIndeks).getIlosc() + "");
        kartaDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        kartaCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void napedRefresh() {
        napedProducent.setText(napedy.get(napedIndeks).getProducent());
        napedModel.setText(napedy.get(napedIndeks).getModel());
        napedCena.setText(napedy.get(napedIndeks).getCena() + " zl ");
        napedGwarancja.setText(napedy.get(napedIndeks).getGwarancja());
        napedRodzajNapedu.setText(napedy.get(napedIndeks).getRodzajNapedu());
        napedInterfejs.setText(napedy.get(napedIndeks).getInterfejs());
        napedZapis.setText(napedy.get(napedIndeks).getZapis());
        napedOdczyt.setText(napedy.get(napedIndeks).getOdczyt());

        napedWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, napedy.get(napedIndeks).getIlosc(), 1));
        napedDostepnaIlosc.setText(napedy.get(napedIndeks).getIlosc() + "");
        napedDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        napedCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void obudowaRefresh() {
        obudowaProducent.setText(obudowy.get(obudowaIndeks).getProducent());
        obudowaModel.setText(obudowy.get(obudowaIndeks).getModel());
        obudowaCena.setText(obudowy.get(obudowaIndeks).getCena() + " zl ");
        obudowaGwarancja.setText(obudowy.get(obudowaIndeks).getGwarancja());
        obudowaWaga.setText(obudowy.get(obudowaIndeks).getWaga() + " kg ");
        obudowaWymiary.setText(obudowy.get(obudowaIndeks).getWysokosc() + " mm x  " + obudowy.get(obudowaIndeks).getSzerokosc() + " mm x  " + obudowy.get(obudowaIndeks).getGlebokosc() + "mm ");
        obudowaStandard.setText(obudowy.get(obudowaIndeks).getStandardPlyty());
        obudowaMaterial.setText(obudowy.get(obudowaIndeks).getMaterial() + "");

        obudowyWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, obudowy.get(obudowaIndeks).getIlosc(), 1));
        obudowyDostepnaIlosc.setText(obudowy.get(obudowaIndeks).getIlosc() + "");
        obudowyDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        obudowaCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void pamiecRAMRefresh() {
        pamiecProducent.setText(pamieciRAM.get(pamiecRAMIndeks).getProducent());
        pamiecModel.setText(pamieciRAM.get(pamiecRAMIndeks).getModel());
        pamiecCena.setText(pamieciRAM.get(pamiecRAMIndeks).getCena() + " zl ");
        pamiecGwarancja.setText(pamieciRAM.get(pamiecRAMIndeks).getGwarancja());
        pamiecRodzajPamieci.setText(pamieciRAM.get(pamiecRAMIndeks).getRodzajPamieci());
        pamiecPojemnosc.setText(pamieciRAM.get(pamiecRAMIndeks).getPojemnoscKosci() + " GB ");
        pamiecIlosc.setText(pamieciRAM.get(pamiecRAMIndeks).getIloscKosci() + "");
        pamiecTaktowanie.setText(pamieciRAM.get(pamiecRAMIndeks).getTaktowanie() + " MHz ");

        pamiecWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, pamieciRAM.get(pamiecRAMIndeks).getIlosc(), 1));
        pamiecDostepnaIlosc.setText(pamieciRAM.get(pamiecRAMIndeks).getIlosc() + "");
        pamiecDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        pamiecCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void plytaGlownaRefresh() {
        plytaProducent.setText(plytyGlowne.get(plytaGlownaIndeks).getProducent());
        plytaModel.setText(plytyGlowne.get(plytaGlownaIndeks).getModel());
        plytaCena.setText(plytyGlowne.get(plytaGlownaIndeks).getCena() + " zl ");
        plytaGwarancja.setText(plytyGlowne.get(plytaGlownaIndeks).getGwarancja());
        plytaObsProcesory.setText(plytyGlowne.get(plytaGlownaIndeks).getObslugiwaneProcesory());
        plytaFormat.setText(plytyGlowne.get(plytaGlownaIndeks).getFormat());
        plytaGniazdo.setText(plytyGlowne.get(plytaGlownaIndeks).getGniazdoProcesora());
        plytaChipset.setText(plytyGlowne.get(plytaGlownaIndeks).getChipset());

        plytyWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, plytyGlowne.get(plytaGlownaIndeks).getIlosc(), 1));
        plytyDostepnaIlosc.setText(plytyGlowne.get(plytaGlownaIndeks).getIlosc() + "");
        plytyDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        plytaCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void procesorRefresh() {
        procesorProducent.setText(procesory.get(procesorIndeks).getProducent());
        procesorModel.setText(procesory.get(procesorIndeks).getModel());
        procesorCena.setText(procesory.get(procesorIndeks).getCena() + " zl ");
        procesorGwarancja.setText(procesory.get(procesorIndeks).getGwarancja());
        procesorLiczbaRdzeni.setText(procesory.get(procesorIndeks).getLiczbaRdzeni() + "");
        procesorTaktowanie.setText(procesory.get(procesorIndeks).getTaktowanieRdzenia() + " MHz ");
        procesorCache.setText(procesory.get(procesorIndeks).getCache() + " MB ");

        procesorWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, procesory.get(procesorIndeks).getIlosc(), 1));
        procesorDostepnaIlosc.setText(procesory.get(procesorIndeks).getIlosc() + "");
        procesorDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        procesorCena.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void zasilaczRefresh() {
        zasilaczProducent.setText(zasilacze.get(zasilaczIndeks).getProducent());
        zasilaczModel.setText(zasilacze.get(zasilaczIndeks).getModel());
        zasilaczCena.setText(zasilacze.get(zasilaczIndeks).getCena() + " zl ");
        zasilaczGwarancja.setText(zasilacze.get(zasilaczIndeks).getGwarancja());
        zasilaczMoc.setText(zasilacze.get(zasilaczIndeks).getMoc() + "");
        zasilaczStandard.setText(zasilacze.get(zasilaczIndeks).getStandard() + "");
        zasilaczSprawnosc.setText(zasilacze.get(zasilaczIndeks).getSprawnosc() + "");
        zasilaczCertyfikat.setText(zasilacze.get(zasilaczIndeks).getCertyfikat() + "");

        zasilaczWybranaIloscSpinner.setModel(new SpinnerNumberModel(0, 0, zasilacze.get(zasilaczIndeks).getIlosc(), 1));
        zasilaczDostepnaIlosc.setText(zasilacze.get(zasilaczIndeks).getIlosc() + "");
        zasilaczDostepnaIlosc.setHorizontalAlignment(SwingConstants.CENTER);
        zasilaczCena.setHorizontalAlignment(SwingConstants.CENTER);
    }


    private void daneDoPlikuChlodzenie() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\chlodzenie.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\chlodzenie.txt");

        int liczba = chlodzenia.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Chlodzenie c : chlodzenia) {
            writer.append(System.lineSeparator() + c.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuDysk() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\dyski.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\dyski.txt");

        int liczba = dyski.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Dysk d : dyski) {
            writer.append(System.lineSeparator() + d.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuKartaGraficzna() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\karta_graficzna.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\karta_graficzna.txt");

        int liczba = kartyGraficzne.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (KartaGraficzna k : kartyGraficzne) {
            writer.append(System.lineSeparator() + k.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuPlytaGlowna() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\plyta_glowna.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\plyta_glowna.txt");

        int liczba = plytyGlowne.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (PlytaGlowna p : plytyGlowne) {
            writer.append(System.lineSeparator() + p.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuNaped() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\naped.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\naped.txt");

        int liczba = napedy.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Naped n : napedy) {
            writer.append(System.lineSeparator() + n.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuObudowa() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\obudowa.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\obudowa.txt");

        int liczba = obudowy.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Obudowa o : obudowy) {
            writer.append(System.lineSeparator() + o.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuPamiecRAM() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\pamiecRAM.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\pamiecRAM.txt");

        int liczba = pamieciRAM.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (PamiecRAM p : pamieciRAM) {
            writer.append(System.lineSeparator() + p.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuProcesor() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\procesor.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\procesor.txt");

        int liczba = procesory.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Procesor p : procesory) {
            writer.append(System.lineSeparator() + p.daneDoPliku());
        }

        writer.close();
    }

    private void daneDoPlikuZasilacz() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\zasilacz.txt"));
        String linia = dane.readLine();

        FileWriter writer = new FileWriter("src\\BazyDanych\\zasilacz.txt");

        int liczba = zasilacze.size();

        writer.write(linia + System.lineSeparator());
        writer.append(String.valueOf(liczba));

        for (Zasilacz z : zasilacze) {
            writer.append(System.lineSeparator() + z.daneDoPliku());
        }

        writer.close();
    }


    private void getDane() throws IOException {

        chlodzenia = getDaneChlodzenie();
        dyski = getDaneDysk();
        kartyGraficzne = getDaneKartaGraficzna();
        napedy = getDaneNaped();
        obudowy = getDaneObudowa();
        pamieciRAM = getDanePamiecRAM();
        plytyGlowne = getDanePlytaGlowna();
        procesory = getDaneProcesor();
        zasilacze = getDaneZasilacz();
    }

    private LinkedList<Chlodzenie> getDaneChlodzenie() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\chlodzenie.txt"));

        String linia;
        LinkedList<Chlodzenie> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Chlodzenie chlodzenie = new Chlodzenie("", "", 0, "", 0, "", "");
            linia = dane.readLine();
            chlodzenie.getDaneZPliku(linia);
            komponenty.add(chlodzenie);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<Dysk> getDaneDysk() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\dyski.txt"));

        String linia;
        LinkedList<Dysk> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Dysk dysk = new Dysk("", "", 0, "", 0, 0, "", "", 0, "");
            linia = dane.readLine();
            dysk.getDaneZPliku(linia);
            komponenty.add(dysk);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<PlytaGlowna> getDanePlytaGlowna() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\plyta_glowna.txt"));

        String linia;
        LinkedList<PlytaGlowna> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            PlytaGlowna plytaGlowna = new PlytaGlowna("", "", 0, "", 0, "", "", "", "");
            linia = dane.readLine();
            plytaGlowna.getDaneZPliku(linia);
            komponenty.add(plytaGlowna);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<KartaGraficzna> getDaneKartaGraficzna() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\karta_graficzna.txt"));

        String linia;
        LinkedList<KartaGraficzna> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            KartaGraficzna kartaGraficzna = new KartaGraficzna("", "", 0, "", 0, 0, "", "");
            linia = dane.readLine();
            kartaGraficzna.getDaneZPliku(linia);
            komponenty.add(kartaGraficzna);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<Naped> getDaneNaped() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\naped.txt"));

        String linia;
        LinkedList<Naped> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Naped naped = new Naped("", "", 0, "", 0, "", "", "", "");
            linia = dane.readLine();
            naped.getDaneZPliku(linia);
            komponenty.add(naped);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<Obudowa> getDaneObudowa() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\obudowa.txt"));

        String linia;
        LinkedList<Obudowa> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Obudowa obudowa = new Obudowa("", "", 0, "", 0, 0, 0, 0, 0, "", "");
            linia = dane.readLine();
            obudowa.getDaneZPliku(linia);
            komponenty.add(obudowa);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<PamiecRAM> getDanePamiecRAM() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\pamiecRAM.txt"));

        String linia;
        LinkedList<PamiecRAM> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            PamiecRAM pamiecRAM = new PamiecRAM("", "", 0, "", 0, "", 0, "", 0);
            linia = dane.readLine();
            pamiecRAM.getDaneZPliku(linia);
            komponenty.add(pamiecRAM);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<Procesor> getDaneProcesor() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\procesor.txt"));

        String linia;
        LinkedList<Procesor> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Procesor procesor = new Procesor("", "", 0, "", 0, 0, 0, 0);
            linia = dane.readLine();
            procesor.getDaneZPliku(linia);
            komponenty.add(procesor);
            licznik++;
        }
        return komponenty;
    }

    private LinkedList<Zasilacz> getDaneZasilacz() throws IOException {
        BufferedReader dane = new BufferedReader(new FileReader("src\\BazyDanych\\zasilacz.txt"));

        String linia;
        LinkedList<Zasilacz> komponenty = new LinkedList<>();

        dane.readLine();
        int liczba = Integer.parseInt(dane.readLine());
        int licznik = 0;
        while (licznik < liczba) {
            Zasilacz zasilacz = new Zasilacz("", "", 0, "", 0, 0, "", "", "");
            linia = dane.readLine();
            zasilacz.getDaneZPliku(linia);
            komponenty.add(zasilacz);
            licznik++;
        }
        return komponenty;
    }


//    public void stworzPC() {
//
//    }


}

