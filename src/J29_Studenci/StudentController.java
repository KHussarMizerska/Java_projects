package J29_Studenci;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    private ArrayList<Student> studentList = new ArrayList<>(); //w uruchumieniowej nie mogłaby być lista private

    Scanner sc = new Scanner(System.in);

    public StudentController() { // konstruktor dla tej klasy
        while (true) {
            System.out.println("D - dodaj, P - pokaż, U - usuń, M - modyfikuj, L - liczba studentów, K - koniec");
            String dec = sc.nextLine().toUpperCase();
            if (dec.equals("D")) {
                addStudent();
                System.out.println("Liczba studentów: " + Student.count);
            } else if (dec.equals("P")) {
                showStudent();
            } else if (dec.equals("U")) {
                deleteStudent();
            } else if (dec.equals("M")) {
                updateStudent();
            } else if (dec.equals("L")) {
                countStudent();
            } else if (dec.equals("K")) {
                break;
            }
        }
    }
        public void addStudent() {
            System.out.println("Podaj imię: "); //metoda na dodawanie studenta
            String imie = sc.nextLine();
            System.out.println("Podaj nazwisko: ");
            String nazwisko = sc.nextLine();
            System.out.println("Podaj nr indeksu: "); //warto by tu dodać jeszcze sprawdzenie, czy dany nr indeksu już istnieje
            int index = sc.nextInt();
            sc.nextLine();

            Student student = new Student(imie, nazwisko, index);
            studentList.add(student);
            Student.count++;
        }
        public void showStudent() {
            System.out.println("**************************");
            System.out.println("Liczba studentów: " + Student.count);
            for (Student temp : studentList) {
                System.out.format("%-10s | %-15s | %-15s", temp.getImie(), temp.getNazwisko(), temp.getIndex());
                System.out.println();
                }
            System.out.println("**************************");
        }

        public void deleteStudent() {

            System.out.println("Podaj nr indeksu studenta do usunięcia:");
            int nr_i = sc.nextInt();
            sc.nextLine();

            for (Student temp : studentList) {
                if (temp.getIndex() == (nr_i)){ //uwaga na typ danych! od tego zależy czy używamy equals czy ==
                    studentList.remove(temp); // metoda remove usuwa wg wartości, pop wg indexu
                    Student.count--;
                    break;
                }
            }
        }

        public void updateStudent() {

            System.out.println("Podaj nr indeksu studenta do zmiany danych:");
            int nr_i = sc.nextInt();
            sc.nextLine();

            for (Student temp : studentList) {
                if (temp.getIndex() == (nr_i)) { //uwaga na typ danych! od tego zależy czy używamy equals czy ==
                    System.out.println("Podaj nowe nazwisko: ");
                    String nazw = sc.nextLine();
                    temp.setNazwisko(nazw);
                    System.out.println("Podaj nowe imię: ");
                    String im = sc.nextLine();
                    temp.setNazwisko(im);
                    break; //musi być break żeby nie szukał dalej w pętli
                }
            }

        }

        public void countStudent() {
            System.out.println("Liczba studentów: " + Student.count);
        }
}


