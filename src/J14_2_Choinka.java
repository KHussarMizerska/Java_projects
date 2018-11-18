import java.util.Scanner;

// Program rysujący choinkę o zadanej wysokości n.

public class J14_2_Choinka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wysokość choinki: ");
        int n = input.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=(n-i); j++) { // j - liczba spacji
                System.out.print(" ");

            }
            for (int k = 1; k<=((2*i)-1); k++){ // k - liczba gwiazdek
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

