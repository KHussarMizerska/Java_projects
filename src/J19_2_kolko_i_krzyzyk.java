import java.util.*;

// Gra w kółko i krzyżyk

public class J19_2_kolko_i_krzyzyk {
    public static void main(String[] args) {

        HashMap<String, String> plansza = new HashMap<>(); // plansza zdefiniowana jako mapa, puste pola
        plansza.put("00"," ");
        plansza.put("01"," ");
        plansza.put("02"," ");
        plansza.put("10"," ");
        plansza.put("11"," ");
        plansza.put("12"," ");
        plansza.put("20"," ");
        plansza.put("21"," ");
        plansza.put("22"," ");

        System.out.println("Zagrajmy w kółko i krzyżyk! Plansza wygląda tak:");

        System.out.println(plansza.get("00") + "|" + plansza.get("01") + "|" + plansza.get("02"));
        System.out.println("-+-+-");
        System.out.println(plansza.get("10") + "|" + plansza.get("11") + "|" + plansza.get("12"));
        System.out.println("-+-+-");
        System.out.println(plansza.get("20") + "|" + plansza.get("21") + "|" + plansza.get("22"));

        System.out.println("Ruchy wykonujemy, podając współrzędne:");

        System.out.println("00" + "|" + "01" + "|" + "02");
        System.out.println("--+--+--");
        System.out.println("10" + "|" + "11" + "|" + "12");
        System.out.println("--+--+--");
        System.out.println("20" + "|" + "21" + "|" + "22");


        String[] wygrana1 = {"00", "01", "02"};
        Set set1 = new HashSet(Arrays.asList(wygrana1));
        String[] wygrana2 = {"10", "11", "12"};
        Set set2 = new HashSet(Arrays.asList(wygrana2));
        String[] wygrana3 = {"20", "21", "22"};
        Set set3 = new HashSet(Arrays.asList(wygrana3));
        String[] wygrana4 = {"00", "10", "20"};
        Set set4 = new HashSet(Arrays.asList(wygrana4));
        String[] wygrana5 = {"01", "11", "21"};
        Set set5 = new HashSet(Arrays.asList(wygrana5));
        String[] wygrana6 = {"02", "12", "22"};
        Set set6 = new HashSet(Arrays.asList(wygrana6));
        String[] wygrana7 = {"00", "11", "22"};
        Set set7 = new HashSet(Arrays.asList(wygrana7));
        String[] wygrana8 = {"20", "11", "02"};
        Set set8 = new HashSet(Arrays.asList(wygrana8));

        ArrayList<String> ruchy = new ArrayList<>(); //możliwe ruchy zebrane w liście
        ruchy.add("00");
        ruchy.add("01");
        ruchy.add("02");
        ruchy.add("10");
        ruchy.add("11");
        ruchy.add("12");
        ruchy.add("20");
        ruchy.add("21");
        ruchy.add("22");

        HashSet<String> graczO= new HashSet<>();
        HashSet<String> graczX= new HashSet<>();

        int i = 1;

        while (i < 10) {

            Scanner inputO = new Scanner(System.in);
            System.out.println("Postaw kółko: ");
            String ruchO = inputO.nextLine();

            while (!ruchy.contains(ruchO)) {
                System.out.println("Nie ma takiego pola!");
                System.out.println("Postaw kółko: ");
                String ruchObis = inputO.nextLine();
                ruchO = ruchObis;
            }

            graczO.addAll(graczX);

            while (graczO.contains(ruchO)) {
                System.out.println("Pole zajęte!");
                System.out.println("Postaw kółko: ");
                String ruchObis = inputO.nextLine();
                ruchO = ruchObis;
            }

            graczO.add(ruchO);
            plansza.put(ruchO, "O");
            System.out.println(plansza.get("00") + "|" + plansza.get("01") + "|" + plansza.get("02"));
            System.out.println("-+-+-");
            System.out.println(plansza.get("10") + "|" + plansza.get("11") + "|" + plansza.get("12"));
            System.out.println("-+-+-");
            System.out.println(plansza.get("20") + "|" + plansza.get("21") + "|" + plansza.get("22"));

            if (graczO.containsAll(set1) || graczO.containsAll(set2) || graczO.containsAll(set3) || graczO.containsAll(set4) ||
                    graczO.containsAll(set5) || graczO.containsAll(set6) || graczO.containsAll(set7) || graczO.containsAll(set8)) {
                System.out.println("Wygrywa kółko!");
                break;
            }
            i ++;

            Scanner inputX = new Scanner(System.in);
            System.out.println("Postaw krzyżyk: ");
            String ruchX = inputX.nextLine();

            while (!ruchy.contains(ruchX)) {
                System.out.println("Nie ma takiego pola!");
                System.out.println("Postaw krzyżyk: ");
                String ruchXbis = inputO.nextLine();
                ruchX = ruchXbis;
            }

            graczO.addAll(graczX);

            while (graczO.contains(ruchX)) {
                System.out.println("Pole zajęte!");
                System.out.println("Postaw krzyżyk: ");
                String ruchXbis = inputO.nextLine();
                ruchX = ruchXbis;
            }

            graczX.add(ruchX);
            plansza.put(ruchX, "X");
            System.out.println(plansza.get("00") + "|" + plansza.get("01") + "|" + plansza.get("02"));
            System.out.println("-+-+-");
            System.out.println(plansza.get("10") + "|" + plansza.get("11") + "|" + plansza.get("12"));
            System.out.println("-+-+-");
            System.out.println(plansza.get("20") + "|" + plansza.get("21") + "|" + plansza.get("22"));

            if (graczX.containsAll(set1) || graczX.containsAll(set2) || graczX.containsAll(set3) || graczX.containsAll(set4) ||
                    graczX.containsAll(set5) || graczX.containsAll(set6) || graczX.containsAll(set7) || graczX.containsAll(set8)) {
                System.out.println("Wygrywa krzyżyk!");
                break;
            }

            i ++;

        }

    }
}
