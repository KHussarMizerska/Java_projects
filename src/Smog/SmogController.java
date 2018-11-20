package Smog;

import java.util.ArrayList;
import java.util.Scanner;

public class SmogController {

    Scanner sc = new Scanner(System.in);
    ArrayList<Smog> sList = new ArrayList<>();
    public int year;
    public int month;
    public int day;
    public int air;
    public static int count;

    public SmogController() {

        System.out.println("                       *********   ");
        System.out.println("  Witaj w programie  * S M O G * ! ");
        System.out.println("                    *********   ");
        System.out.println("                   *******  ");
        System.out.println("                  ******   ");
        System.out.println("      ____       *****  ");
        System.out.println("     /    \\  __***");
        System.out.println("    /      \\ | |");
        System.out.println("   /        \\| |");
        System.out.println("  /          \\ |");
        System.out.println(" /            \\|");
        System.out.println("/______________\\");
        System.out.println("|   __    __   |");
        System.out.println("|  |__|  |__|  |");
        System.out.println("|              |");
        System.out.println("|   __    __   |");
        System.out.println("|  |__|  |__|  |");
        System.out.println("|     ____     |");
        System.out.println("|     |  |     |");
        System.out.println("|_____|__|_____|");

        while (true) {

            System.out.println("D - dodaj dane; P - pokaż dane; W - wyjście");
            Scanner sc = new Scanner(System.in);
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                dodaj();
            } else if (dec.equals("P")) {
                pokaz();
            } else if (dec.equals("W")) {
                break;
            } else {
                System.out.println("Nie ma takiej opcji!");
            }
        }
    }

        public void dodaj() {
            System.out.println("Podaj rok: ");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            sc.nextLine();
            System.out.println("Podaj miesiąc: ");
            month = sc.nextInt();
            sc.nextLine();
            System.out.println("Podaj dzień: ");
            day = sc.nextInt();
            sc.nextLine();
            System.out.println("Podaj jakość powietrza (% normy): ");
            air = sc.nextInt();
            sc.nextLine();

            Smog s = new Smog(year, month, day, air);
            sList.add(s);
            count++;

        }

        public void pokaz() {
            double suma = 0;
            System.out.println("Dane jakości powietrza z poszczególnych dni: ");
            System.out.println();
            for (Smog temp:sList) {
                System.out.format(temp.getYear() + "-" + temp.getMonth() + "-" + temp.getDay() + "    " + temp.getAir() + "%%");
                System.out.println();
                suma += temp.getAir();
            }
            System.out.println("Srednia jakości powietrza z poszczególnych dni: " + suma / count);


        }

    }








