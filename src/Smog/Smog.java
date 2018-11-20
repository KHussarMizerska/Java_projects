package Smog;

public class Smog {

    public int year;
    public int month;
    public int day;
    public int air;

    public Smog(int year, int month, int day, int air) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setAir(air);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }
}

