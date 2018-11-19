import java.util.Arrays;
import java.util.Scanner;

public class J22_2_odgadnij_haslo_cale_haslo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj hasło do odgadnięcia: ");
        String haslo = input.nextLine();

        String[] hasloTab = haslo.split("");
        int i = hasloTab.length;
        String[] wynik = new String[i];

        for (int j = 0; j < i; j++) {
            wynik[j] = "_ ";
        }
        for (String temp : wynik) {
            System.out.print(temp);
        }

        System.out.println();
        System.out.println("\nMasz 3 ruchy na odgadnięcie hasła, możesz podawać litery lub całe hasło!");
        int proba = 1;

        do {
            System.out.println();
            System.out.println("Odgadnij hasło - podaj literę lub całe hasło:");
            String litera = input.nextLine();

            String[] literaTab = litera.split("");

            if (Arrays.equals(hasloTab, literaTab)) {
                System.out.println("Brawo, to jest to hasło!");
                break;
            }
            for (int j = 0; j < i; j++) {
                if (hasloTab[j].equals(litera)) {
                    wynik[j] = litera;
                }
            }
            for (String temp : wynik) {
                System.out.print(temp);
            }
            proba++;
        } while (!Arrays.equals(hasloTab, wynik) && (proba < 4));

        System.out.println("\nGame over!");
    }
}

