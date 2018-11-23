package Powierzchnie;

import java.util.ArrayList;
import java.util.Scanner;

public class PomieszczeniaController {

    Scanner sc = new Scanner(System.in);
    private ArrayList<Pomieszczenia> pLista = new ArrayList<>();

    public String nazwa;
    public double dlugosc;
    public double szerokosc;
    public double powierzchnia;

    public PomieszczeniaController() {

        while (true) {
            System.out.println("Co chcesz zrobić? D - dodaj pomieszczenie, P - pokaż dane, W - wyjście");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                dodaj();
                System.out.println("Liczba pomieszczeń: " + Pomieszczenia.count);
            } else if (dec.equals("P")) {
                pokaz();
            } else if (dec.equals("W")) {
                break;
            } else {
                System.out.println("Błędne dane!");
            }
        }
    }

    public void dodaj() {
            System.out.println("Podaj nazwę pomieszczenia: ");
            nazwa = sc.nextLine();
            System.out.println("Podaj długość pomieszczenia " + nazwa + " w metrach:");
            dlugosc = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj szerokość pomieszczenia " + nazwa + " w metrach:");
            szerokosc = sc.nextDouble();
            sc.nextLine();
            powierzchnia = Math.round(dlugosc*szerokosc);

            Pomieszczenia p = new Pomieszczenia(nazwa, dlugosc, szerokosc, powierzchnia);
            pLista.add(p);
            p.count++;
        }

       public void pokaz() {
        double suma = 0;
           System.out.println("***********************************************************************");
           System.out.format("%-15s | %-15s | %-15s | %-15s", "POMIESZCZENIE", "DŁUGOŚĆ [m]", "SZEROKOŚĆ [m]", "POWIERZCHNIA [m2]");
           System.out.println("\n-----------------------------------------------------------------------");
            for (Pomieszczenia temp:pLista) {
                System.out.format("%-15s | %-15s | %-15s | %-15s", temp.getNazwa(), temp.getDlugosc(), temp.getSzerokosc(), temp.getPowierzchnia());
                System.out.println();
                suma += temp.getPowierzchnia();
            }

           System.out.println("***********************************************************************");
           // System.out.println("Łączna liczba pomieszczeń: " + p.count);
           System.out.println("Łączna powierzchnia pomieszczeń: " + suma + " m2");
           System.out.println("***********************************************************************");
        }
}
