package Powierzchnie;

public class Pomieszczenia {
    public String nazwa;
    public double dlugosc;
    public double szerokosc;
    public double powierzchnia;
    public static int count;

    public Pomieszczenia(String nazwa, double dlugosc, double szerokosc, double powierzchnia) {
        setNazwa(nazwa);
        setDlugosc(dlugosc);
        setSzerokosc(szerokosc);
        setPowierzchnia(powierzchnia);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }
}
