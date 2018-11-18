package J29_Studenci;

public class Student {

    private String imie;
    private String nazwisko;
    private int index;
    public static int count; //do zliczania liczby studentów

    public Student(String imie, String nazwisko, int index) {
        this.imie = imie; // albo lepiej: setImie(imie);
        this.nazwisko = nazwisko; // setNazwisko(nazwisko);
        this.index = index; // setIndex(index);
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                '}';
    }

    public String getImie() { return imie; }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
