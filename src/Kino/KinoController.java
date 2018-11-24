package Kino;

import java.util.ArrayList;
import java.util.Scanner;

public class KinoController {

    ArrayList<Kino> listaKin = new ArrayList<>();
    ArrayList<String> filmyLista = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    public String nazwaKina;
    public String dec;


    public KinoController() {

        filmyLista.add("Kler");
        filmyLista.add("Star Wars");
        filmyLista.add("Seksmisja");
        filmyLista.add("Kevin sam w domu");
        filmyLista.add("Bohemian Rhapsody");
        filmyLista.add("Shrek");
        filmyLista.add("Titanic");

        while (true) {
            System.out.println("1 - Dodaj kino; 2 - Dodaj filmy; 3 - Wyświetl repertuar kin; W - wyjście");
            dec = sc.nextLine().toUpperCase();
            if (dec.equals("1")) {
                dodajKino();
            } else if (dec.equals("2")) {
                dodajFilm();
            } else if (dec.equals("3")) {
                repertuar();
            } else if (dec.equals("W")) {
                break;
            } else {
                System.out.println("Nie ma takiej opcji wyboru!");
            }
        }
    }

    public void dodajKino() {

        System.out.println("Podaj nazwę kina: ");
        nazwaKina = sc.nextLine().toUpperCase();
        Kino k = new Kino(nazwaKina);
        listaKin.add(k);
    }

    public void dodajFilm() {

            for (Kino temp : listaKin) {

                while(true) {
                    System.out.println("Dla kina " + temp.getNazwaKina());
                    System.out.println("Dodaj filmy: <0> aby zakończyć wybór");
                    System.out.println("Aktualnie dostępne filmy:");

                    for (int i = 0; i < filmyLista.size(); i++) {
                        System.out.println(i + 1 + " - " + filmyLista.get(i));
                    }

                    int d = sc.nextInt();
                    sc.nextLine();
                    if (d != 0) {
                        temp.fLista.add(filmyLista.get(d - 1));

                    } else if (d == 0) {
                        break;
                    }
                }
            }
    }

    public void repertuar() {

        System.out.print("Aktualny repertuar kin: ");
        System.out.println();
        for (Kino temp : listaKin) {
            System.out.println(temp.getNazwaKina());
            for (String x : temp.fLista) {
            System.out.println(x);
        }
    }

    }
}