package Kino;

import java.util.ArrayList;

public class Kino {

    private String nazwaKina;
    ArrayList<String> fLista = new ArrayList<>();

    public ArrayList<String> getfLista() {
        return fLista;
    }

    public void setfLista(ArrayList<String> fLista) {
        this.fLista = fLista;
    }

    public Kino(String nazwaKina) {
        setNazwaKina(nazwaKina);
    }

    public String getNazwaKina() {
        return nazwaKina;
    }

    public void setNazwaKina(String nazwaKina) {
        this.nazwaKina = nazwaKina;
    }
}
